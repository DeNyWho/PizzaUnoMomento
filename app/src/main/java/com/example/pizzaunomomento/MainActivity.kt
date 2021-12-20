package com.example.pizzaunomomento

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.PopupMenu
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.ui.setupWithNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragment) as NavHostFragment
        navController = navHostFragment.findNavController()
        val popupMenu = PopupMenu(this, null)
        popupMenu.inflate(R.menu.menu)
        val menu = popupMenu.menu
        bottomBar.setupWithNavController(menu, navController)
        setupSmoothBottomMenu()
        navController.addOnDestinationChangedListener { _, destination, _ ->
            when(destination.id){
                R.id.reg_next -> bottomBar.visibility = View.GONE
                R.id.cart2 -> bottomBar.visibility = View.GONE
                R.id.orderBuy2 -> bottomBar.visibility = View.GONE
                R.id.orderBuyTwo -> bottomBar.visibility = View.GONE
                R.id.delivery -> bottomBar.visibility = View.GONE
                R.id.registration3 -> bottomBar.visibility = View.GONE
                R.id.nextReg2 -> bottomBar.visibility = View.GONE
                else -> bottomBar.visibility = View.VISIBLE
            }
        }
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }


    private fun setupSmoothBottomMenu() {
        val popupMenu = PopupMenu(this, null)
        popupMenu.inflate(R.menu.menu)
        val menu = popupMenu.menu
        bottomBar.setupWithNavController(menu, navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }

}