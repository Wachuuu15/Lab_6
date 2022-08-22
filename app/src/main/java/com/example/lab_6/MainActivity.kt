package com.example.lab_6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
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
                R.id.menu_option_home -> setFragment(HomeFragment())
                R.id.menu_option_search -> setFragment(SearchFragment())
                R.id.menu_option_library -> setFragment(LibraryFragment())
            }
            true
        }
    }

    private fun setFragment(fragment: Fragment) {
        supportFragmentManager.commit {
            setReorderingAllowed(true)
            replace(R.id.fragmentContainerView, fragment)
        }
    }



}