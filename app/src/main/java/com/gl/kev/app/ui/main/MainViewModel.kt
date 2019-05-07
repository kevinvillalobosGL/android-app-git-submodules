package com.gl.kev.app.ui.main

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import com.gl.kev.app.App
import com.gl.kev.app.data.DataManager
import io.reactivex.functions.Consumer
import javax.inject.Inject

class MainViewModel(application: Application) : AndroidViewModel(application) {

    @Inject
    lateinit var mDataManager: DataManager

    init {
        getApplication<App>().mApplicationComponent.inject(this)
    }

    fun getPhotos() {
        mDataManager.getPhotos(
            Consumer {
                Log.e("App", "I retrieved ${it.size} photos")
                mDataManager.getDbHelper().getPhotoDao().insertAll(it)
            },
            Consumer {
                Log.e("App", it.message, it)
            })
    }

    fun getTodos() {
        mDataManager.getTodos(
            Consumer {
                Log.e("App", "I retrieved ${it.size} 'todos'")

            },
            Consumer {
                Log.e("App", it.message, it)
            })
    }

    override fun onCleared() {
        super.onCleared()
    }

}