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
        supportFragmentManager.findFragmentById(R.id.nav_host_fragment_content_navigation)!!.findNavController()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setTheme()
        setupBottomNavigation()
    }

    private fun setupBottomNavigation() {
        //TODO fazer igual a NavigationActivity
        with(binding.bottomNavigation) { setupWithNavController(navController) }
    }

    private fun setTheme() {
    }

    private fun openAccountNavigationOptions() {
        val intent = Intent(this@MainActivity, NavigationActivity::class.java)
        startActivity(intent)
    }
}
