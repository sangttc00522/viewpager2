package com.tech.viewpager2.Adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.tech.viewpager2.Views.DemoFragment

class FragmentStateAdapter(fa: FragmentActivity) : FragmentStateAdapter(fa) {
    override fun getItemCount(): Int {
        return 5
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> DemoFragment.newInstance("FirstFragment, Instance 1")
            1 -> DemoFragment.newInstance("DemoFragment, Instance 1")
            else -> DemoFragment.newInstance("ThirdFragment, Default")
        }
    }
}