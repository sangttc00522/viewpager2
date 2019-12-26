package com.tech.viewpager2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment


class demoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_demo, container, false)
    }


    companion object {
        val EXTRA_MESSAGE = "EXTRA_MESSAGE"

        fun newInstance(paramString: String): demoFragment {
            val f = demoFragment()
            val localBundle = Bundle(1)
            localBundle.putString("EXTRA_MESSAGE", paramString)
            f.setArguments(localBundle)
            return f
        }
    }
}