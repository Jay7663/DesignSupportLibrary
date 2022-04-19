package com.example.designsupportlibrary

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnNavigationView: Button = findViewById(R.id.btnNavigationView)
        val btnCoordinatorScroll: Button = findViewById(R.id.btnCoordinatorScroll)

        btnNavigationView.setOnClickListener {
            startActivity(Intent(this, NavigationDrawerHomeActivity::class.java))
        }

        btnCoordinatorScroll.setOnClickListener {
            startActivity(Intent(this, CoordinatorScrollActivity::class.java))
        }
    }
}