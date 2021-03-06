package com.danhdueexoictif.androidgenericadapter.ui.screen.home

import com.danhdueexoictif.androidgenericadapter.R
import com.danhdueexoictif.androidgenericadapter.databinding.HomeFragmentBinding
import com.danhdueexoictif.androidgenericadapter.ui.base.BaseFragment
import org.koin.android.ext.android.inject

class HomeFragment : BaseFragment<HomeFragmentBinding, HomeViewModel>() {

    companion object {
        fun newInstance() = HomeFragment()
    }

    override val layoutId: Int = R.layout.home_fragment
    override val viewModel: HomeViewModel by inject()

}
