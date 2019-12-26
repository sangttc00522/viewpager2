package com.tech.viewpager2

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class MyFragmentAdapter(fa: FragmentActivity) : FragmentStateAdapter(fa) {
    override fun getItemCount(): Int {
        return 5
    }

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> return demoFragment.newInstance("FirstFragment, Instance 1")
            1 -> return demoFragment.newInstance("demoFragment, Instance 1")
            else -> return demoFragment.newInstance("ThirdFragment, Default")
        }
    }
}