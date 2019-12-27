package com.tech.viewpager2.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.tech.viewpager2.R

class ViewPagerAdapter : RecyclerView.Adapter<ViewPagerAdapter.EventViewHolder>() {
    private val eventList = listOf("0", "1", "2","3","4","5","6")

    // Layout "layout_demo_viewpager2_cell.xml" will be defined later
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        EventViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.layout_demo_viewpager2_cell,
                parent,
                false
            )
        )

    override fun getItemCount() = eventList.count()
    override fun onBindViewHolder(holder: EventViewHolder, position: Int) {
        (holder.view as? TextView)?.also {
            it.text = "Page " + eventList[position]

            val backgroundColorResId = if (position % 2 == 0) {
                R.color.blue
            } else {
                R.color.orange
            }
            it.setBackgroundColor(ContextCompat.getColor(it.context, backgroundColorResId))
        }
    }

    class EventViewHolder(val view: View) : RecyclerView.ViewHolder(view)
}