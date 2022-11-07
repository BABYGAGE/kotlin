package com.example.babygage

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.babygage.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding : ActivityLoginBinding
        binding = ActivityLoginBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.signupbtn.setOnClickListener {
            val nextScreen = Intent(applicationContext, SignupActivity::class.java)
            startActivity(nextScreen)
        }


        binding.loginbtn.setOnClickListener {
            val nextScreen = Intent(applicationContext, intro_select_activity::class.java)
            startActivity(nextScreen)
        }
    }
}