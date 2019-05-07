package com.gl.kev.app.navigation

import android.app.Activity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import com.gl.kev.app.ui.startup.next.StartupFragment
import com.gl.kev.app.ui.startup.welcome.WelcomeFragment

class StartupCoordinator(
    var navigator: Navigator,
    var nextNavigation: ((fromActivity: Activity, options: Bundle?) -> Unit)?
) {

    var viewId: Int = 0x0
    var supportFragmentManager: FragmentManager? = null

    var startupFragment: StartupFragment = StartupFragment()
    var welcomeFragment: WelcomeFragment = WelcomeFragment()

    fun showStart() {
        if (supportFragmentManager == null || viewId == 0x0) {
            throw Exception("No initialized properly")
        }
        navigator.goToFragment(
            supportFragmentManager!!,
            startupFragment,
            viewId,
            startupFragment.javaClass.simpleName,
            false
        )
    }

    fun showNext() {
        if (supportFragmentManager == null || viewId == 0x0) {
            throw Exception("No initialized properly")
        }
        navigator.goToFragment(
            supportFragmentManager!!,
            welcomeFragment,
            viewId,
            welcomeFragment.javaClass.simpleName,
            false
        )
    }


}