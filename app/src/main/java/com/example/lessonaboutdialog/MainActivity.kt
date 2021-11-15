package com.example.lessonaboutdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.click).setOnClickListener {

            val dialog = DialogFragment()
            dialog.isCancelable = false
            dialog.show(supportFragmentManager, "dialog")
        }
    }
}