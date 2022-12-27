package com.example.romansa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.romansa.databinding.ActivityOneBinding

class OneActivity : AppCompatActivity() {
    private lateinit var binding: ActivityOneBinding
    private var list=mutableListOf<OnboardingData>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityOneBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getData()
        binding.vw2.apply {
            adapter=ViewpagerAdapter(list)
            orientation=ViewPager2.ORIENTATION_HORIZONTAL
        }
        binding.dotsIndicator.setViewPager2(binding.vw2)
        binding.nextButton.setOnClickListener {
            startActivity(Intent (this@OneActivity, SignIn1Activity::class.java))
        }
    }
    fun getData() {
        list.add(OnboardingData(
            title = "Exploring Upcoming and Nearby Events",
            message = "Cheer up your day by booking tickets GoEvent application quickly, easy, and practical.",
            image = R.drawable.gambar1
        ))
        list.add(OnboardingData(
            title = "Schedule Your Order",
            message = "Cheer up your day by booking tickets GoEvent application quickly, easy, and practical.",
            image = R.drawable.gambar2
        ))
        list.add(OnboardingData(
            title = "Reach Location without Complicated out of the house!",
            message = "Enough with a handheld smartphone now you can enjoy various facilities and practical.",
            image = R.drawable.gambar3
        ))
    }
}