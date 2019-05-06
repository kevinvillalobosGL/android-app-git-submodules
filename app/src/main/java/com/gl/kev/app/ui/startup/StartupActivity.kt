package com.gl.kev.app.ui.startup

import android.os.Bundle
import com.gl.kev.app.R
import com.gl.kev.app.databinding.ActivityStartupBinding
import com.gl.kev.app.ui.main.MainViewModel
import com.gl.kev.framework.ui.BaseActivity

class StartupActivity : BaseActivity<ActivityStartupBinding, StartupViewModel>() {

    override fun initViews(savedInstanceState: Bundle?) {

    }

    override fun getLayout(): Int {
        return R.layout.activity_startup
    }

    override fun getBindingVariable(): Int {
        return BaseActivity.DEFAULT_BINDING_VARIABLE
    }


}
