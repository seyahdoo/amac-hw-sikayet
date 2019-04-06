package com.sadogan.amachwsikayet

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        complaint_add.setOnClickListener {
            val myIntent = Intent(this, ComplaintAdd::class.java)
            this.startActivity(myIntent)
        }

    }
}
