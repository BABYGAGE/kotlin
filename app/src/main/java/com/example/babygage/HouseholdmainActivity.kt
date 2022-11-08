package com.example.babygage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.babygage.databinding.ActivityHouseholdmainBinding

class HouseholdmainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding : ActivityHouseholdmainBinding
        binding = ActivityHouseholdmainBinding.inflate(layoutInflater)

        setContentView(binding.root)

    }
}