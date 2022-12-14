package com.example.babygage_ocr

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.babygage_ocr.databinding.ActivitySignupBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore

class SignupActivity : AppCompatActivity() {

    private lateinit var firebaseAuth: FirebaseAuth
    private lateinit var firestore: FirebaseFirestore

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding: ActivitySignupBinding
        binding = ActivitySignupBinding.inflate(layoutInflater)

        setContentView(binding.root)

        firebaseAuth= FirebaseAuth.getInstance()
        firestore= FirebaseFirestore.getInstance()


        binding.signupbtn.setOnClickListener {
            val email = binding.useremail.text.toString()
            val pass = binding.userpassword.text.toString()
            val confirmPass = binding.userConfirmPassword.text.toString()
            val username = binding.username.text.toString()

            fun savePreference(view: View) {
                val sharedPref = getPreferences(Context.MODE_PRIVATE) ?: return
                with(sharedPref.edit()) {
                    putString("username", binding.username.text.toString())
                    putString("useremail", binding.useremail.text.toString())
                    apply()
                }
                Toast.makeText(this, "preference saved", Toast.LENGTH_SHORT).show()
                binding.username.text.clear()
                binding.useremail.text.clear()
            }

            val mypageScreen = Intent(this, MypageFragment::class.java)
            mypageScreen.putExtra("sendname", username)
            mypageScreen.putExtra("sendemail",email)

            if(email.isNotEmpty() && pass.isNotEmpty() && confirmPass.isNotEmpty()) {
                if (pass.equals(confirmPass)) {
                    firebaseAuth.createUserWithEmailAndPassword(email, pass).addOnCompleteListener{
                        if(it.isSuccessful) {
                            var useraccount = UserAccount()
                            useraccount.userId = email
                            useraccount.userName = username
                            useraccount.userPassword = pass
                            firestore?.collection("User Account")?.document(email)?.set(useraccount)
                            Toast.makeText(this,"save user account information",Toast.LENGTH_SHORT).show()
                            val nextScreen = Intent(this, SuccessfulsignupActivity::class.java)
                            startActivity(nextScreen)
                        }
                        else {
                            Toast.makeText(this, "account creation failed", Toast.LENGTH_SHORT).show()
                        } // it.exception.toString()
                    }
                } else {
                    Toast.makeText(this, "Password is not matching", Toast.LENGTH_SHORT).show()
                }
            }
            else {
                Toast.makeText(this,"Empty fields", Toast.LENGTH_SHORT).show()
            }



            // ????????? ??????????????? ???????????? ??????



        }

    }
}