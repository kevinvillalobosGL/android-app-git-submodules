package com.gl.kev.app.ui.startup

import android.os.Bundle
import com.gl.kev.app.R
import com.gl.kev.app.databinding.ActivityStartupBinding
import com.gl.kev.framework.ui.BaseActivity

class StartupActivity : BaseActivity<ActivityStartupBinding, StartupViewModel>() {



    override fun initViews(savedInstanceState: Bundle?) {
        //Init Coordinator Values for this view...
        mViewModel.coordinator.apply {
            viewId = R.id.startup_container //This could easily be in the Coordinator... Or not?
            supportFragmentManager = getSupportFragmentManager()
        }
        mViewModel.coordinator.showStart()

    }

    override fun getLayout(): Int {
        return R.layout.activity_startup
    }

    override fun getBindingVariable(): Int {
        return DEFAULT_BINDING_VARIABLE
    }


}