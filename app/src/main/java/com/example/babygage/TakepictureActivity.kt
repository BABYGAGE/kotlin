package com.example.babygage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.babygage.databinding.ActivityTakepictureBinding


class TakepictureActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding : ActivityTakepictureBinding
        binding = ActivityTakepictureBinding.inflate(layoutInflater)

        setContentView(binding.root)

    }
}