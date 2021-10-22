package com.example.practiceuiinvision

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class ResetPassActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reset_pass)
        val btnResetPass: Button = findViewById(R.id.btn_reset_pass);
        val imgArrowBack : ImageView =findViewById(R.id.btn_arrow_back);
        val txtTitleAppbar: TextView =findViewById(R.id.txt_title_appbar);
        btnResetPass.setOnClickListener(View.OnClickListener {
            val intent: Intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)
        })
        imgArrowBack.setOnClickListener(View.OnClickListener {
            val intent:Intent= Intent(this,OTPActivity::class.java)
            startActivity(intent)
        })
        txtTitleAppbar.text = "Reset Password"
    }
}