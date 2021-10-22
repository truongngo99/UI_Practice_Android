package com.example.practiceuiinvision

import android.content.Intent
import android.graphics.Paint
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        val titleProfile:TextView=findViewById(R.id.txt_title_in_menu)
        val txtEdit:TextView=findViewById(R.id.txt_right)
        val imgArrowBack:ImageView=findViewById(R.id.btn_arrow_back_kyc)
        titleProfile.text="Profile"
        txtEdit.text= getString(R.string.edit)
        txtEdit.paintFlags =Paint.UNDERLINE_TEXT_FLAG
        imgArrowBack.setOnClickListener(View.OnClickListener {
            val intent: Intent = Intent(this,HomeActivity::class.java)
            startActivity(intent)
        })
    }
}