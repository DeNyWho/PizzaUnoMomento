package com.example.pizzaunomomento.fragments

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.PopupMenu
import android.widget.Toast
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pizzaunomomento.Adapter.RecyclerProfile
import com.example.pizzaunomomento.Adapter.ViewPagerBottomMain
import com.example.pizzaunomomento.R
import com.example.pizzaunomomento.data.MainPage
import com.example.pizzaunomomento.data.Order
import kotlinx.android.synthetic.main.fragment_profile.*
import me.ibrahimsn.lib.OnItemSelectedListener


class profile : Fragment() {
    private val list = ArrayList<Order>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_profile, container, false)

        prepareData()
        val recyclerView = view.findViewById<RecyclerView>(R.id.recycler)
        recyclerView!!.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.itemAnimator = DefaultItemAnimator()
        val adapter = RecyclerProfile(list)
        recyclerView.adapter = adapter


        return view
    }

    private fun prepareData() {
        val data = Order(
            "6 декабря 09:21",
            "Тонкое тесто, томатный\\nсоус, размер S",
            "пышное тесто, томатный соус\\nразмер L, баклажаны, белые\\nгрибы, паприка, цукини, оливки\\nи маслины",
            "с креветками",
            "2670₽",
            "490₽",
            "1600₽",
            "580₽",
            "Пицца Гавайская x1",
            "Пицца Конструктор x1",
            "Салат Цезарь x2",
            "— доставлен")
        list.add(data)

    }

}