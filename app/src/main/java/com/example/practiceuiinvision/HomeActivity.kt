package com.example.practiceuiinvision

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val layoutItemCoin:LinearLayout=findViewById(R.id.layout_item_coin)
        val btnMenu : ImageView=findViewById(R.id.btn_menu)
        val btnNotification : ImageView=findViewById(R.id.btn_notification)
        layoutItemCoin.setOnClickListener(View.OnClickListener {
            val intent:Intent = Intent(this,YourCoinActivity::class.java)
            startActivity(intent)
        })
        btnMenu.setOnClickListener(View.OnClickListener {
            val intent:Intent = Intent(this,MenuActivity::class.java)
            startActivity(intent)
        })
        btnNotification.setOnClickListener(View.OnClickListener {
            val intent:Intent = Intent(this,NotificationActivity::class.java)
            startActivity(intent)
        })

    }
}