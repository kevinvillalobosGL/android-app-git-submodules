package com.gl.kev.app.ui.startup.next


import com.gl.kev.app.R
import com.gl.kev.app.databinding.FragmentStartupBinding
import com.gl.kev.app.ui.startup.StartupViewModel
import com.gl.kev.framework.ui.BaseActivity
import com.gl.kev.framework.ui.BaseFragment


class StartupFragment : BaseFragment<FragmentStartupBinding, StartupViewModel>() {

    override fun initViews() {
        mBinding.bt42.setOnClickListener {
            mViewModel.coordinator.showNext()
        }
    }

    override fun getLayout(): Int {
        return R.layout.fragment_startup
    }

    override fun getBindingVariable(): Int {
        return BaseActivity.DEFAULT_BINDING_VARIABLE
    }


}
