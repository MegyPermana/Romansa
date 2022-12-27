package com.example.romansa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.romansa.databinding.ActivitySplashScreenBinding

class SplashScreenActivity : AppCompatActivity() {
    private val splashTimeOut: Long = 4000L
    private lateinit var splashBinding: ActivitySplashScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        splashBinding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(splashBinding.root)

        Handler(mainLooper).postDelayed({
            startActivity(Intent(this, OneActivity::class.java))

            finish()
        }, splashTimeOut)
    }
}
