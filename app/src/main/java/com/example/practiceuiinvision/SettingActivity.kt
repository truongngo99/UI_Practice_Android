package com.example.practiceuiinvision

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class SettingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting)

        val imgArrowBack:ImageView=findViewById(R.id.btn_arrow_back)
        val txtTitleSetting:TextView=findViewById(R.id.txt_title_in_menu)
        imgArrowBack.setOnClickListener(View.OnClickListener {
            val intent: Intent = Intent(this,HomeActivity::class.java)
            startActivity(intent)
        })
        txtTitleSetting.text = "Settings"
    }
}