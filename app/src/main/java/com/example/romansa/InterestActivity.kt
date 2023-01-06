package com.example.romansa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.romansa.databinding.ActivityInterestBinding
import com.example.romansa.databinding.ActivitySignIn1Binding

class InterestActivity : AppCompatActivity() {
    private lateinit var binding: ActivityInterestBinding
    var categories = arrayListOf<Any>(
        arrayOf("music", resources.getDrawable(R.drawable.music)),
        arrayOf("sport", resources.getDrawable(R.drawable.sports)),
        arrayOf("technology", resources.getDrawable(R.drawable.teknologi)),
        arrayOf("art", resources.getDrawable(R.drawable.art)),
        arrayOf("party", resources.getDrawable(R.drawable.party)),
        arrayOf("education", resources.getDrawable(R.drawable.edukasi)),
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityInterestBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var musik = ""
        var sport = ""
        var teknologi = ""
        var seni = ""
        var parti = ""
        var edukasi = ""
    }
}