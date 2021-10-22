package com.example.practiceuiinvision

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val txvForgotPass: TextView = findViewById(R.id.txt_forgot_pass)
        val btnSignIn:Button=findViewById(R.id.btn_sign_in)


        txvForgotPass.setOnClickListener(View.OnClickListener {
            val intent:Intent = Intent(this, ForgotPassActivity::class.java)
            startActivity(intent)
        })
        btnSignIn.setOnClickListener(View.OnClickListener {
            val  intent:Intent = Intent(this,HomeActivity::class.java)
            startActivity(intent)
        })
    }
}