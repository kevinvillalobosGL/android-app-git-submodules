package com.gl.kev.app.data

import android.util.Log
import com.gl.kev.app.data.api.ApiHelper
import com.gl.kev.app.data.local.db.DbHelper
import com.gl.kev.framework.data.BaseDataManager
import com.gl.kev.framework.utils.rx.SchedulerProvider
import com.gl.kev.model.io.PhotoResponse
import com.gl.kev.model.io.TodoResponse
import io.reactivex.functions.Consumer
import javax.inject.Inject

class AppDataManager @Inject constructor(
    private val mDbHelper: DbHelper,
    private val mApiHelper: ApiHelper,
    mSchedulerProvider: SchedulerProvider
) : DataManager, BaseDataManager(mSchedulerProvider) {

    override fun getTodos(response: Consumer<TodoResponse>, failure: Consumer<Throwable>) {
        getCompositeDisposable().add(
            mApiHelper.doGetTodos()
                .subscribeOn(mSchedulerProvider.io())
                .observeOn(mSchedulerProvider.ui())
                .subscribe(response, failure)
        )
    }

    override fun getPhotos(response: Consumer<PhotoResponse>, failure: Consumer<Throwable>) {
        getCompositeDisposable().add(
            mApiHelper.doGetPhotos()
                .subscribeOn(mSchedulerProvider.io())
                .observeOn(mSchedulerProvider.ui())
                .subscribe(response, failure)
        )
    }

    fun getAndSavePhotos(failure: Consumer<Throwable>) {
        getCompositeDisposable().add(
            mApiHelper.doGetPhotos()
                .subscribeOn(mSchedulerProvider.io())
                .map {
                    mDbHelper.getPhotoDao().insertAll(it)
                    it
                }
                .observeOn(mSchedulerProvider.io())
                .subscribe(Consumer {
                    Log.i("Demo", "I retrieved and saved ${it.size} photos")
                }, failure)
        )
    }

    override fun getDbHelper(): DbHelper {
        return mDbHelper
    }

    override fun getApiHelper(): ApiHelper {
        return mApiHelper
    }

}