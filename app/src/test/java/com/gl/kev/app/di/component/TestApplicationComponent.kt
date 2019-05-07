package com.gl.kev.app.di.component

import com.gl.kev.app.data.api.AppApiHelperTest
import com.gl.kev.app.di.module.TestRestApiModule
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = [TestRestApiModule::class])
interface TestApplicationComponent {

    fun inject(test: AppApiHelperTest)
}