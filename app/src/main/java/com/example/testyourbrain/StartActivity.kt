package com.example.testyourbrain

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class StartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
    }

    fun onClickStart(view: View) {
        val intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
    }
    fun onClickRecord(view: View) {
        val intent = Intent(this,RecordActivity::class.java)
        startActivity(intent)
    }
}