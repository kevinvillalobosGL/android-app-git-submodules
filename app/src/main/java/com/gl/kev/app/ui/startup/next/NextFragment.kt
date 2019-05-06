package com.gl.kev.app.ui.startup.next


import com.gl.kev.app.R
import com.gl.kev.app.databinding.FragmentNextBinding
import com.gl.kev.app.ui.main.MainViewModel
import com.gl.kev.app.ui.startup.StartupViewModel
import com.gl.kev.framework.ui.BaseActivity
import com.gl.kev.framework.ui.BaseFragment


class NextFragment : BaseFragment<FragmentNextBinding, StartupViewModel>() {

    override fun initViews() {

    }

    override fun getLayout(): Int {
        return R.layout.fragment_next
    }

    override fun getBindingVariable(): Int {
        return BaseActivity.DEFAULT_BINDING_VARIABLE
    }


}
