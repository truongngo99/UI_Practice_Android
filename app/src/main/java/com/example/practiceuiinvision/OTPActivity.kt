package com.example.practiceuiinvision

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class OTPActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otpactivity)
        val btnContinueOTP: Button = findViewById(R.id.btn_continue);
        val imgArrowBack : ImageView =findViewById(R.id.btn_arrow_back);
        val txtTitleAppbar: TextView =findViewById(R.id.txt_title_appbar);
        btnContinueOTP.setOnClickListener(View.OnClickListener {
            val intent: Intent = Intent(this,ResetPassActivity::class.java)
            startActivity(intent)
        })
        imgArrowBack.setOnClickListener(View.OnClickListener {
            val intent:Intent= Intent(this,ForgotPassActivity::class.java)
            startActivity(intent)
        })
        txtTitleAppbar.text = "OTP Verification"
    }
}