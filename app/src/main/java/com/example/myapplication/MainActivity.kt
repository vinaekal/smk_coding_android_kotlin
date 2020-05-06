package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            var inputEmail = findViewById(R.id.inputEmail) as EditText
            var inputPassword = findViewById(R.id.inputPassword) as EditText
        var btnSignIn = findViewById(R.id.btnSignIn) as Button
        var btnSignUp = findViewById(R.id.btnSignUp) as Button
        btnSignIn.setOnClickListener {
                val email = inputEmail.text;
                val password = inputPassword.text;
                Toast.makeText(this@MainActivity, email, Toast.LENGTH_LONG).show()
            }

        fun SignUp(view: View) {
            btnSignUp = findViewById(R.id.btnSignUp)
            btnSignUp.setOnClickListener{
                startActivity(Intent(this, ActivityDua::class.java))
            }
            startActivity(intent)
        }
    }
}


