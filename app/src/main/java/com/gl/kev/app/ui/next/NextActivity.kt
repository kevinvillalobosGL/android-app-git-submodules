package com.gl.kev.app.ui.next

import android.os.Bundle
import com.gl.kev.app.R
import com.gl.kev.app.databinding.ActivityNextBinding
import com.gl.kev.framework.ui.BaseActivity

class NextActivity : BaseActivity<ActivityNextBinding, NextViewModel>() {

    override fun initViews(savedInstanceState: Bundle?) {

    }

    override fun getLayout(): Int {
        return R.layout.activity_next
    }

    override fun getBindingVariable(): Int {
        return BaseActivity.DEFAULT_BINDING_VARIABLE
    }


}
