package com.example.pizzaunomomento.Adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.pizzaunomomento.Fifty
import com.example.pizzaunomomento.R
import com.example.pizzaunomomento.data.MainPage
import com.example.pizzaunomomento.fragments.fifty

class ViewPagerBottomMain(val list: List<MainPage>):
    RecyclerView.Adapter<ViewPagerBottomMain.MyViewHolder>() {


    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val itemTitle: TextView = view.findViewById(R.id.title)
        val itemTag: TextView = view.findViewById(R.id.tag)
        val itemCost: TextView = view.findViewById(R.id.cost)
        val frame: FrameLayout = view.findViewById(R.id.frame)

        fun bindItems(item: MainPage) {

            itemTitle.text = item.title
            itemTag.text = item.tag
            itemCost.text = item.cost
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_recycler, parent, false)
        return MyViewHolder(view)

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bindItems(list[position])
        val context = holder.itemView.context
        holder.frame.setOnClickListener { if(holder.itemTitle.text == "50/50"){
            val intent = Intent(context,Fifty::class.java)
            context.startActivity(intent)
        } }
    }

    override fun getItemCount(): Int {
        return list.size
    }


}
