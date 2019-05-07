package com.gl.kev.app.di.component

import com.gl.kev.app.App
import com.gl.kev.app.di.module.CoordinatorModule
import com.gl.kev.app.di.module.RestApiModule
import com.gl.kev.app.di.module.RoomDataBaseModule
import com.gl.kev.app.ui.main.MainViewModel
import com.gl.kev.app.ui.next.SecondViewViewModel
import com.gl.kev.app.ui.startup.StartupViewModel
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [RoomDataBaseModule::class, RestApiModule::class, CoordinatorModule::class])
interface ApplicationComponent {

    fun inject(app: App)

    fun inject(viewModel: MainViewModel)

    fun inject(viewModel: SecondViewViewModel)

    fun inject(viewModel: StartupViewModel)
}