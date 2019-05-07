package com.gl.kev.app.navigation

import android.app.Activity
import android.os.Bundle

//This class should contain all other Coordinators
class RootFlowCoordinator(var navigator: Navigator) {

    var startupCoordinator: StartupCoordinator
    var secondViewCoordinator: SecondViewCoordinator

    init {
        startupCoordinator = StartupCoordinator(navigator, nextNavigation = this::toNextActivity)
        secondViewCoordinator = SecondViewCoordinator(navigator, nextNavigation = this::toMainActivity)
    }

    fun toNextActivity(fromActivity: Activity, options: Bundle?) {
        navigator.toNextActivity(fromActivity, options)
    }

    fun toMainActivity(fromActivity: Activity, options: Bundle?) {
        navigator.toMainActivity(fromActivity, options)
    }
}