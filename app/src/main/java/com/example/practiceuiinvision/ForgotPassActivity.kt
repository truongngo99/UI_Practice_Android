package com.example.practiceuiinvision

import android.annotation.SuppressLint
import android.app.ActionBar.DISPLAY_SHOW_CUSTOM
import android.content.Intent
import android.graphics.Typeface
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.ActionBar

class ForgotPassActivity : AppCompatActivity() {
    @SuppressLint("WrongConstant", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_pass)
        val btnRequestOTP: Button = findViewById(R.id.btn_request_otp);
        val imgArrowBack :ImageView =findViewById(R.id.btn_arrow_back);
        val txtTitleAppbar: TextView =findViewById(R.id.txt_title_appbar);
        btnRequestOTP.setOnClickListener(View.OnClickListener {
            val intent:Intent= Intent(this,OTPActivity::class.java)
            startActivity(intent)
        })
        imgArrowBack.setOnClickListener(View.OnClickListener {
            val intent:Intent= Intent(this,LoginActivity::class.java)
            startActivity(intent)
        })
        txtTitleAppbar.text = "Forgot Password"
    }
}


