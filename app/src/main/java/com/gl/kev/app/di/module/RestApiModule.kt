package com.gl.kev.app.di.module

import com.gl.kev.app.data.api.ApiHelper
import com.gl.kev.app.data.api.AppApiHelper
import com.gl.kev.framework.utils.rx.AppSchedulerProvider
import com.gl.kev.framework.utils.rx.SchedulerProvider
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
open class RestApiModule {

    @Provides
    open fun provideSchedulerProvider(): SchedulerProvider {
        //Since AppSchedulerProvider is on Framework, we cannot add the Inject Constructor
        return AppSchedulerProvider()
    }

    @Provides
    @Singleton
    open fun provideApiHelper(appApiHelper: AppApiHelper): ApiHelper {
        return appApiHelper
    }
}