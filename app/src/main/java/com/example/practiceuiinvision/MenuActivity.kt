package com.example.practiceuiinvision

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val txtTitleMenu: TextView = findViewById(R.id.txt_title_bar)
        val igvBtnArrowBack:ImageView= findViewById(R.id.btn_menu)
        val txtHome:TextView=findViewById(R.id.txt_home)
        val txtTrend:TextView=findViewById(R.id.txt_trend)
        val txtProfile:TextView=findViewById(R.id.txt_profile)
        val txtKYC:TextView=findViewById(R.id.txt_KYC)
        val txtSignOut:TextView=findViewById(R.id.txt_sign_out)
        val txtSetting:TextView=findViewById(R.id.txt_settings)
        igvBtnArrowBack.setImageResource(R.drawable.ic_baseline_arrow_back)
        igvBtnArrowBack.setOnClickListener(
            View.OnClickListener {
                val intent:Intent=Intent(this,HomeActivity::class.java)
                startActivity(intent)
            }
        )
        txtHome.setOnClickListener(
            View.OnClickListener {
                val intent:Intent=Intent(this,HomeActivity::class.java)
                startActivity(intent)
            }
        )
        txtTrend.setOnClickListener(
            View.OnClickListener {
                val intent:Intent=Intent(this,TrendsActivity::class.java)
                startActivity(intent)
            }
        )
        txtKYC.setOnClickListener(
            View.OnClickListener {
                val intent:Intent=Intent(this,KYCActivity::class.java)
                startActivity(intent)
            }
        )
        txtProfile.setOnClickListener(
            View.OnClickListener {
                val intent:Intent=Intent(this,ProfileActivity::class.java)
                startActivity(intent)
            }
        )
        txtSetting.setOnClickListener(
            View.OnClickListener {
                val intent:Intent=Intent(this,SettingActivity::class.java)
                startActivity(intent)
            }
        )
        txtSignOut.setOnClickListener(
            View.OnClickListener {
                val intent:Intent=Intent(this,LoginActivity::class.java)
                startActivity(intent)
            }
        )
        txtTitleMenu.text="Menu"

    }
}

