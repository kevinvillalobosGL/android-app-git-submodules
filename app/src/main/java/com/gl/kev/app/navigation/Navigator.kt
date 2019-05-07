package com.gl.kev.app.navigation

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.gl.kev.app.ui.main.MainActivity
import com.gl.kev.app.ui.next.SecondViewActivity

//This class should be singleton... and the activity, fragment or context should be a parameter on each method
class Navigator {

    fun toNextActivity(fromActivity: Activity, options: Bundle?) {
        val intent = Intent(fromActivity, SecondViewActivity::class.java)
        fromActivity.startActivity(intent, options)
        fromActivity.finish()
    }

    fun toMainActivity(fromActivity: Activity, options: Bundle?) {
        val intent = Intent(fromActivity, MainActivity::class.java)
        fromActivity.startActivity(intent, options)
        fromActivity.finish()
    }

    fun goToFragment(
        supportFragmentManager: FragmentManager,
        fragment: Fragment,
        viewId: Int,
        tag: String,
        addToBackStack: Boolean
    ) {
        var transaction = supportFragmentManager.beginTransaction()
            .replace(viewId, fragment, tag)
        if (addToBackStack) {
            transaction = transaction.addToBackStack(tag)
        }

        transaction.commit()
    }
}