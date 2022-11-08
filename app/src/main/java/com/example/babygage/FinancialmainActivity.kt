package com.example.babygage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.babygage.databinding.ActivityFinancialmainBinding
import com.example.babygage.databinding.ActivityLoginBinding

class FinancialmainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_financialmain)

        var binding : ActivityFinancialmainBinding
        binding = ActivityFinancialmainBinding.inflate(layoutInflater)

        setContentView(binding.root)
    }
}