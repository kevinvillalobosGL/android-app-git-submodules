package com.gl.kev.app.coordinator

import javax.inject.Inject
import javax.inject.Singleton

//This class should contain all other Coordinators
@Singleton
class RootFlowCoordinator @Inject constructor(navigator: Navigator) {

    private var starupCoordinator: StarupCoordinator
    private var nextCoordinator: NextCoordinator

    init {
        starupCoordinator = StarupCoordinator(nextNavigation = this::toNextActivity)
        nextCoordinator = NextCoordinator(nextNavigation = this::toMainActivity)
    }

    fun toNextActivity() {
        //HowDaF can I go from on activity to another without the context to start it up!
    }

    fun toMainActivity() {

    }


}