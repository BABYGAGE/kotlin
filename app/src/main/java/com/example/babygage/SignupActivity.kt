package com.example.babygage

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.babygage.databinding.ActivitySignupBinding

class SignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding: ActivitySignupBinding
        binding = ActivitySignupBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.signupbtn.setOnClickListener {
            val nextScreen = Intent(applicationContext, SuccessfulsignupActivity::class.java)
            startActivity(nextScreen)
        }
    }
}