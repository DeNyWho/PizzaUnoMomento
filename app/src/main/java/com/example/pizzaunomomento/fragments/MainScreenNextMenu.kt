package com.example.pizzaunomomento.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.example.pizzaunomomento.Adapter.ViewPagerAdapter
import com.example.pizzaunomomento.Adapter.ViewPagerBottomMain
import com.example.pizzaunomomento.R
import com.example.pizzaunomomento.data.MainPage
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainScreenNextMenu : Fragment() {
    private val list = ArrayList<MainPage>()
    private var title_one = mutableListOf<String>()
    private var title_two = mutableListOf<String>()
    private var title_three = mutableListOf<String>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_main_screen_next_menu, container, false)
        val viewPager = view.findViewById<ViewPager2>(R.id.view_pager2)

        prepareData()

        val recyclerView = view.findViewById<RecyclerView>(R.id.recycler)
        recyclerView!!.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.itemAnimator = DefaultItemAnimator()
        val adapter = ViewPagerBottomMain(list)
        recyclerView.adapter = adapter

        title_one.addAll(listOf("Пицца", "Салаты", "Уно-\nЛанчи", "Напитки"))
        title_two.addAll(listOf("Паста", "Закуски", "Уно-\nНаборы", "Соусы"))
        title_three.addAll(listOf("Япония", "Супы", "Десерты", "empty"))
        viewPager.adapter = ViewPagerAdapter(title_one, title_two, title_three)
        viewPager.orientation = ViewPager2.ORIENTATION_HORIZONTAL
        val tabDots = view.findViewById<TabLayout>(R.id.tabDots)
        TabLayoutMediator(tabDots, viewPager) { _, _ -> }.attach()
        return view
    }

    private fun prepareData() {
        var data = MainPage("50/50", "новинка", "от 615 ₽")
        list.add(data)
        data = MainPage("Конструктор", "сделай свою пиццу", "от 370 ₽")
        list.add(data)
        data = MainPage("Маргарита", "фаворитка месяца", "от 620 ₽")
        list.add(data)
    }

}