package com.gl.kev.app.ui.main

import android.os.Bundle
import com.gl.kev.app.R
import com.gl.kev.app.databinding.ActivityMainBinding
import com.gl.kev.framework.ui.BaseActivity

class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>() {

    override fun initViews(savedInstanceState: Bundle?) {
        mViewModel.getPhotos()
        mViewModel.getTodos()
    }

    override fun getLayout(): Int {
        return R.layout.activity_main
    }

    override fun getBindingVariable(): Int {
        return DEFAULT_BINDING_VARIABLE
    }

}
