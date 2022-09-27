package com.example.signup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {


    lateinit var appleBtn: Button
    lateinit var googleBtn: Button
    lateinit var createBtn: Button
    lateinit var email: EditText
    lateinit var username: EditText
    lateinit var password: EditText



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        appleBtn = findViewById(R.id.apple)
        googleBtn = findViewById(R.id.google)
        createBtn = findViewById(R.id.create_btn)
        username = findViewById(R.id.username)
        email = findViewById(R.id.email)
        password = findViewById(R.id.password)

        appleBtn.setOnClickListener {
        }
        googleBtn.setOnClickListener {
        }
        createBtn.setOnClickListener {
        }
        addNewUser()

    }
    private fun addNewUser(){

    }
}