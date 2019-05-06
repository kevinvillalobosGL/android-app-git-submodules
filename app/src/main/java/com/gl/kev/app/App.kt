package com.gl.kev.app

import android.app.Application
import com.androidnetworking.AndroidNetworking
import com.gl.kev.app.di.component.ApplicationComponent
import com.gl.kev.app.di.component.DaggerApplicationComponent
import com.gl.kev.app.di.module.CoordinatorModule
import com.gl.kev.app.di.module.RestApiModule
import com.gl.kev.app.di.module.RoomDataBaseModule

class App : Application() {

    lateinit var mApplicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()

        //Init Dagger
        mApplicationComponent = DaggerApplicationComponent
            .builder()
            .roomDataBaseModule(RoomDataBaseModule(this))
            .restApiModule(RestApiModule(this))
            .coordinatorModule(CoordinatorModule(this))
            .build()

        mApplicationComponent.inject(this)

        //Init Android Networking
        AndroidNetworking.initialize(applicationContext)
        if (BuildConfig.DEBUG) {
            //AndroidNetworking.enableLogging(HttpLoggingInterceptor.Level.BODY)
        }
    }

}