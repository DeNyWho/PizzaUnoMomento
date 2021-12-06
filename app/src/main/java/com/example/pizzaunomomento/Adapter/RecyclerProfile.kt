package com.example.pizzaunomomento.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.pizzaunomomento.R
import com.example.pizzaunomomento.data.MainPage
import com.example.pizzaunomomento.data.Order

class RecyclerProfile(val list: List<Order>):
    RecyclerView.Adapter<RecyclerProfile.MyViewHolder>() {


    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val itemTitleFirst: TextView = view.findViewById(R.id.title_first)
        val itemTitleSecond: TextView = view.findViewById(R.id.title_second)
        val itemTitleThird: TextView = view.findViewById(R.id.title_third)
        var itemDescriptionOne: TextView = view.findViewById(R.id.description_one)
        var itemDescriptionTwo: TextView = view.findViewById(R.id.description_two)
        var itemDescriptionThree: TextView = view.findViewById(R.id.description_three)
        val itemStatus: TextView = view.findViewById(R.id.status)
        var data: TextView = view.findViewById(R.id.data)
        var itemCostOne: TextView = view.findViewById(R.id.first_cost)
        var itemCostTwo: TextView = view.findViewById(R.id.second_cost)
        var itemCostThree: TextView = view.findViewById(R.id.third_cost)
        var itemCostFour: TextView = view.findViewById(R.id.fourth_cost)

        fun bindItems(item: Order) {

            itemTitleFirst.text = item.title_one
            itemTitleSecond.text = item.title_two
            itemTitleThird.text = item.title_three
            itemDescriptionOne.text = item.description_one
            itemDescriptionTwo.text = item.description_two
            itemDescriptionThree.text = item.description_three
            data.text = item.data
            itemCostOne.text = item.cost_one
            itemCostTwo.text = item.cost_two
            itemCostThree.text = item.cost_three
            itemCostFour.text = item.cost_four
            itemStatus.text = item.status

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_recycler_profile, parent, false)
        return MyViewHolder(view)

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bindItems(list[position])

    }

    override fun getItemCount(): Int {
        return list.size
    }


}