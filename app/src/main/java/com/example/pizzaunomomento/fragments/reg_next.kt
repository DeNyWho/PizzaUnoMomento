package com.example.pizzaunomomento.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatButton
import androidx.navigation.fragment.findNavController
import com.example.pizzaunomomento.R
import kotlinx.android.synthetic.main.activity_main.*

class Reg_next : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_reg_next, container, false)

        val button = view.findViewById<AppCompatButton>(R.id.next)
        button.setOnClickListener {  findNavController().navigate(R.id.action_reg_next_to_registration3)}


        return view
    }
}