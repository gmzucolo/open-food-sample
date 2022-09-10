package com.example.open_food_facts_sample.ui

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.example.open_food_facts_sample.MainActivity
import com.example.open_food_facts_sample.R


class SplashActivity : AppCompatActivity() {

    private val handler = Handler()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        handler.postDelayed({ openHomeFragment() }, 2000)
    }

    private fun openHomeFragment() {
        val intent = Intent(this@SplashActivity, NavigationActivity::class.java)
        startActivity(intent)
        finish()
    }
}