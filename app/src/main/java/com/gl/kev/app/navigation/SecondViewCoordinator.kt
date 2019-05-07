package com.gl.kev.app.navigation

import android.app.Activity
import android.os.Bundle

class SecondViewCoordinator(
    var navigator: Navigator,
    var nextNavigation: ((fromActivity: Activity, options: Bundle?) -> Unit)?
) {

}