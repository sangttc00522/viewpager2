package com.tech.viewpager2.Views

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.tech.viewpager2.R
import com.tech.viewpager2.Utils.EXTRA_MESSAGE


class DemoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_demo, container, false)
    }


    companion object {
        fun newInstance(paramString: String): DemoFragment {
            val f = DemoFragment()
            val localBundle = Bundle(1)
            localBundle.putString(EXTRA_MESSAGE, paramString)
            f.setArguments(localBundle)
            return f
        }
    }
}