package com.gl.kev.app.ui.startup.welcome


import com.gl.kev.app.R
import com.gl.kev.app.databinding.FragmentWelcomeBinding
import com.gl.kev.app.ui.startup.StartupViewModel
import com.gl.kev.framework.ui.BaseActivity
import com.gl.kev.framework.ui.BaseFragment


class WelcomeFragment : BaseFragment<FragmentWelcomeBinding, StartupViewModel>() {

    override fun initViews() {
        mBinding.btWelcome.setOnClickListener {
            mViewModel.coordinator.nextNavigation?.let {
                it(activity!!, null)
            }
        }
    }

    override fun getLayout(): Int {
        return R.layout.fragment_welcome
    }

    override fun getBindingVariable(): Int {
        return BaseActivity.DEFAULT_BINDING_VARIABLE
    }
}
