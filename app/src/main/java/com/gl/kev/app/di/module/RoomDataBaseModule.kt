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
class RoomDataBaseModule(private val mApplication: Application) {

    @Provides
    @DatabaseInfo
    internal fun provideDatabaseName(): String {
        return AppConstants.DB_NAME
    }

    @Provides
    @Singleton
    internal fun provideDataManager(appDataManager: AppDataManager): DataManager {
        return appDataManager
    }

    @Provides
    @Singleton
    internal fun provideAppDatabase(@DatabaseInfo dbName: String): AppDataBase {
        return Room.databaseBuilder(mApplication, AppDataBase::class.java, dbName)
            .fallbackToDestructiveMigration()
            .build()
    }

    @Provides
    @Singleton
    internal fun provideDBHelper(appDbHelper: AppDbHelper): DbHelper {
        return appDbHelper
    }
}