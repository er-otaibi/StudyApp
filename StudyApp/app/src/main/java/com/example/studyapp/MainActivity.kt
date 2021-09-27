package com.example.studyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var kotlinBtn: Button
    lateinit var androidBtn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        kotlinBtn = findViewById(R.id.K_Btn)
        androidBtn = findViewById(R.id.A_Btn)

        kotlinBtn.setOnClickListener {
            val intent = Intent(this, KotlinReview ::class.java)
            startActivity(intent)
        }
        androidBtn.setOnClickListener {
            val intent = Intent(this, AndroidReview ::class.java)
            startActivity(intent)
        }
    }
}