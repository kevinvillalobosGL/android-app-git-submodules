package com.gl.kev.app.di.module

import com.gl.kev.app.data.api.ApiHelper
import com.gl.kev.app.data.api.AppApiHelper
import com.gl.kev.app.utils.rx.TestScheduleProvider
import com.gl.kev.framework.utils.rx.SchedulerProvider
import dagger.Module
import dagger.Provides
import io.reactivex.schedulers.TestScheduler
import javax.inject.Singleton

@Module
class TestRestApiModule {

    @Provides
    fun provideSchedulerProvider(): SchedulerProvider {
        return TestScheduleProvider(TestScheduler())
    }

    @Provides
    @Singleton
    fun provideApiHelper(appApiHelper: AppApiHelper): ApiHelper {
        return appApiHelper
    }

}