package com.gl.kev.app.coordinator

import androidx.appcompat.app.AppCompatActivity
import javax.inject.Inject
import javax.inject.Singleton

//This class should be singleton... and the activity, fragment or context should be a parameter on each method
@Singleton
class Navigator @Inject constructor() {

    fun toNextActivity(activity: AppCompatActivity) {

    }

}