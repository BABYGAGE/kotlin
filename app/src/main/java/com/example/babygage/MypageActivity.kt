package com.example.babygage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.babygage.databinding.ActivityMypageBinding


class MypageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding : ActivityMypageBinding
        binding = ActivityMypageBinding.inflate(layoutInflater)

        setContentView(binding.root)

    }
}