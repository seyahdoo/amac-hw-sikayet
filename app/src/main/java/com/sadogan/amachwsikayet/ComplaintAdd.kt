package com.sadogan.amachwsikayet

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_complaint_add.*
import java.io.IOException

class ComplaintAdd : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_complaint_add)

        complaint_send.setOnClickListener {

            val prefs = applicationContext.getSharedPreferences("complaints", Context.MODE_PRIVATE)
            val editor = prefs.edit()




        }


    }
}
