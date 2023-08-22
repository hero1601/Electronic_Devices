package com.example.electronic_frontend.adapter

//noinspection SuspiciousImport
import android.R
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class CategoryHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private var id: TextView
    var name: TextView

    init {
        id = itemView.findViewById(R.id.text1)
        name = itemView.findViewById(R.id.text2)
    }
}