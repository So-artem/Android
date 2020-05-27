package com.example.lab1

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
        fun send (view: View) {
            if (editText.text.toString() == "" || editText2.text.toString() == "") {
                textView4.setTextColor(Color.parseColor("#ED0909"))
                val handler = android.os.Handler()

                handler.postDelayed({ textView4.setTextColor(Color.parseColor("#14778F")) }, 1600)
            }
            else {
                val inf = Intent(this, Act2::class.java)
                val NameStr = editText.text.toString()
                var GroupStr = editText2.text.toString()
                inf.putExtra(Act2.NAME, NameStr)
                inf.putExtra(Act2.GROUP, GroupStr)
                startActivity(inf)
            }
        }

    fun info (view: View) {
            val inf = Intent(this, Act2::class.java)
            startActivity(inf)
    }
}
