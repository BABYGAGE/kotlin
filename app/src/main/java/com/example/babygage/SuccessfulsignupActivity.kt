package com.example.babygage

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.babygage.databinding.ActivitySuccessfulsignupBinding

class SuccessfulsignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding: ActivitySuccessfulsignupBinding
        binding = ActivitySuccessfulsignupBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.loginpagebtn.setOnClickListener(View.OnClickListener {
            val nextScreen = Intent(applicationContext, LoginActivity::class.java)
            startActivity(nextScreen)
        })
    }
}