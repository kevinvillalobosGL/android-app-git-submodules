package com.gl.kev.app.di.module

import android.app.Application
import com.gl.kev.app.navigation.Navigator
import com.gl.kev.app.navigation.SecondViewCoordinator
import com.gl.kev.app.navigation.RootFlowCoordinator
import com.gl.kev.app.navigation.StartupCoordinator
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class CoordinatorModule(private val mApplication: Application) {

    var navigator = Navigator()
    var rootFlowCoordinator: RootFlowCoordinator = RootFlowCoordinator(navigator)

    @Provides
    @Singleton
    fun rootCoordinatiorProvider(): RootFlowCoordinator {
        return rootFlowCoordinator
    }

    @Provides
    @Singleton
    internal fun provideNextCoordinator(): SecondViewCoordinator {
        return rootFlowCoordinator.secondViewCoordinator
    }

    @Provides
    @Singleton
    internal fun provideStartupCoordinator(): StartupCoordinator {
        return rootFlowCoordinator.startupCoordinator
    }


}