package com.gl.kev.app.di.component

import com.gl.kev.app.App
import com.gl.kev.app.di.module.RestApiModule
import com.gl.kev.app.di.module.RoomDataBaseModule
import com.gl.kev.app.ui.MainViewModel
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [RoomDataBaseModule::class, RestApiModule::class])
interface ApplicationComponent {

    fun inject(app: App)

    fun inject(viewModel: MainViewModel)
}