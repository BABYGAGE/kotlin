package com.example.babygage

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.babygage.databinding.ActivityIntroselectionBinding

class IntroselectionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding : ActivityIntroselectionBinding
        binding = ActivityIntroselectionBinding.inflate(layoutInflater)

        setContentView(binding.root)



        binding.householdbtn.setOnClickListener{
            val nextScreen = Intent(applicationContext, mainpage_household_activity::class.java)
            startActivity(nextScreen)
        }

        binding.financialbtn.setOnClickListener{
            val nextScreen = Intent(applicationContext, mainpage_financial_activity::class.java)
            startActivity(nextScreen)
        }
    }
}