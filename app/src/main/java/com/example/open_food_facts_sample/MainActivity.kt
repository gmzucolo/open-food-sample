package com.example.open_food_facts_sample

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.open_food_facts_sample.databinding.ActivityMainBinding
import com.example.open_food_facts_sample.ui.NavigationActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val navController by lazy {
        supportFragmentManager.findFragmentById(R.id.bottom_nav_host_fragment_content_navigation)!!.findNavController()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupBottomNavigation()
    }

    private fun setupBottomNavigation() {
        with(binding.bottomNavigation) { setupWithNavController(navController) }
    }
}
