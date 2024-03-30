package com.example.gitbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

data class StudentModel(
    val userId: String,
    val username: String,
    val qualification: String,
    val studentNumber: String,
    val photoUrl: String? = null
)
