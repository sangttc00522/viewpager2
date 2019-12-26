package com.tech.viewpager2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        var adapter = DemoViewPagerAdapter()
        var adapter = MyFragmentAdapter(this)
        viewpager.setPageTransformer(ZoomOutPageTransformer())
        viewpager.setPageTransformer(ScalePageTransformer())
        viewpager.requestTransform()
//        viewpager.orientation = ViewPager2.ORIENTATION_HORIZONTAL
        viewpager.orientation = ViewPager2.ORIENTATION_VERTICAL
        viewpager.adapter = adapter
//        viewpager.setPageTransformer()
        TabLayoutMediator(tabLayout, viewpager) { tab, position ->
            tab.setText("Tab $position")
            viewpager.setCurrentItem(tab.position, true)
        }.attach()

    }
}


