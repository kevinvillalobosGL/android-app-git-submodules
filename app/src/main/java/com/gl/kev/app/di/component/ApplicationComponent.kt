package com.gl.kev.app.di.component

import com.gl.kev.app.App
import com.gl.kev.app.di.module.ApplicationModule
import com.gl.kev.app.ui.MainViewModel
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {

    fun inject(app: App)

    fun inject(viewModel: MainViewModel)
}