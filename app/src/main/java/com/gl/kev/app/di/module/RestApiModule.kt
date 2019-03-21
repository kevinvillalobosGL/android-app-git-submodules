package com.gl.kev.app.di.module

import android.app.Application
import androidx.room.Room
import com.gl.kev.app.data.DataManager
import com.gl.kev.app.data.api.ApiHelper
import com.gl.kev.app.data.api.AppApiHelper
import com.gl.kev.app.data.AppDataManager
import com.gl.kev.app.data.local.db.AppDataBase
import com.gl.kev.app.data.local.db.AppDbHelper
import com.gl.kev.app.data.local.db.DbHelper
import com.gl.kev.app.di.qualifier.DatabaseInfo
import com.gl.kev.app.utils.AppConstants
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RestApiModule(private val mApplication: Application) {

    @Provides
    @Singleton
    internal fun provideApiHelper(appApiHelper: AppApiHelper): ApiHelper {
        return appApiHelper
    }
}