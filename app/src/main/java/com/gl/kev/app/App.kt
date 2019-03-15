package com.gl.kev.app

import android.app.Application
import com.gl.kev.app.di.component.ApplicationComponent
import com.gl.kev.app.di.component.DaggerApplicationComponent
import com.gl.kev.app.di.module.ApplicationModule

class App : Application() {

    lateinit var mApplicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()

        mApplicationComponent = DaggerApplicationComponent
            .builder()
            .applicationModule(ApplicationModule(this))
            .build()

        mApplicationComponent.inject(this)
    }

}