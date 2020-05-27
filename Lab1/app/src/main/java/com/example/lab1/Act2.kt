package com.example.lab1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_act2.*

class Act2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_act2)
        if (intent.getStringExtra(NAME) != null && intent.getStringExtra(GROUP) != null)
        {
            textView3.text = null
            textView.text = intent.getStringExtra(NAME)
            textView2.text = intent.getStringExtra(GROUP)
        }
    }

    companion object {
        const val NAME = "NAME"
        const val GROUP = "GROUP"
    }

}
