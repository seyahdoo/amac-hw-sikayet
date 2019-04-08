package com.sadogan.amachwsikayet

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.list_item.view.*

class MyListAdepter(val context: Context) : RecyclerView.Adapter<ViewHolder>() {

    val prefs = context.getSharedPreferences("complaints", Context.MODE_PRIVATE)

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView1.text = prefs.getString("complaint_${position+1}_summary", "ERROR")
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.list_item, parent, false))
    }

    // Gets the number of animals in the list
    override fun getItemCount(): Int {
        return prefs.getInt("complaint_count",0)
    }

}

class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
    // Holds the TextView that will add each animal to
    val textView1 = view.textView!!
}