package com.example.gitbasics

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {

    private lateinit var regBtn : Button
    private lateinit var loginScreenBtn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        // Implement register button click listener
        regBtn.setOnClickListener {
            // Perform registration authentication
            // If registration successful, navigate to profile page
            startActivity(Intent(this, StudentModel::class.java))
            finish()
        }

        // Implement login screen button click listener
        loginScreenBtn.setOnClickListener {
            // Navigate to login screen
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}
