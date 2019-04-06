package com.sadogan.amachwsikayet

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_complaint_add.*

class ComplaintAdd : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_complaint_add)

        complaint_send.setOnClickListener {

            val prefs = applicationContext.getSharedPreferences("complaints", Context.MODE_PRIVATE)
            val editor = prefs.edit()

            var complaintCount = prefs.getInt("complaint_count",0)

            complaintCount++

            editor.putString("complaint_${complaintCount}_summary", complaint_send_summary.text.toString())
            editor.putString("complaint_${complaintCount}_detail", complaint_send_detail.text.toString())
            editor.putString("complaint_${complaintCount}_email", complaint_send_email.text.toString())

            editor.putInt("complaint_count", complaintCount)
            editor.apply()



        }



    }
}
