package com.example.lab_6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var bottomNav: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNav = findViewById(R.id.bottomNav_bottomNavActivity)
        setListeners()
    }

    private fun setListeners() {
        bottomNav.setOnItemSelectedListener {
            // Dependiendo el item del menu, mostramos el fragment deseado
            when(it.itemId) {
                R.id.menu_option_home -> TODO()
                R.id.menu_option_search -> TODO()
                R.id.menu_option_library -> TODO()
            }
            true
        }
    }

}