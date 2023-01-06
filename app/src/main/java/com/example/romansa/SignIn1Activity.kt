package com.example.romansa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.romansa.databinding.ActivitySignIn1Binding

class SignIn1Activity : AppCompatActivity() {
    private lateinit var binding: ActivitySignIn1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySignIn1Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}