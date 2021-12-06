package com.example.pizzaunomomento.Adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.TextView
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.example.pizzaunomomento.R

class ViewPagerAdapter(private val title_one: List<String>,private val title_two: List<String>,private val title_three: List<String>): RecyclerView.Adapter<ViewPagerAdapter.Pager2ViewHolder>() {

    @SuppressLint("ResourceAsColor")
    inner class Pager2ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val itemTitle_one: TextView = itemView.findViewById(R.id.title_one)
        val itemTitle_two: TextView = itemView.findViewById(R.id.title_two)
        val itemTitle_three: TextView = itemView.findViewById(R.id.title_three)
        val frame_one: FrameLayout = itemView.findViewById(R.id.frame_first)
        val frame_two: FrameLayout = itemView.findViewById(R.id.frame_two)
        val frame_three: FrameLayout = itemView.findViewById(R.id.frame_three)

        init{
            frame_one.setOnClickListener {
                itemTitle_one.setTextColor(R.color.white)
                itemTitle_two.setTextColor(R.color.black)
                itemTitle_three.setTextColor(R.color.black)
            }
            frame_two.setOnClickListener {
                itemTitle_one.setTextColor(R.color.black)
                itemTitle_two.setTextColor(R.color.white)
                itemTitle_three.setTextColor(R.color.black)
            }
            frame_three.setOnClickListener {
                itemTitle_one.setTextColor(R.color.black)
                itemTitle_two.setTextColor(R.color.black)
                itemTitle_three.setTextColor(R.color.white)
            }
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerAdapter.Pager2ViewHolder {
        return Pager2ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_page, parent, false))
    }

    override fun onBindViewHolder(holder: ViewPagerAdapter.Pager2ViewHolder, position: Int) {
        holder.itemTitle_one.text = title_one[position]
        holder.itemTitle_two.text = title_two[position]
        holder.itemTitle_three.text = title_three[position]
        if (holder.itemTitle_three.text == "empty")holder.frame_three.isVisible = false
    }

    override fun getItemCount(): Int {
        return title_two.size
    }
}