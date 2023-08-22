package com.example.electronic_frontend.adapter

//noinspection SuspiciousImport
import android.R
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.electronic_frontend.model.Category


class CategoryAdapter(employeeList: List<Category?>) :
    RecyclerView.Adapter<CategoryHolder>() {
    private val employeeList: List<Category?>

    init {
        this.employeeList = employeeList
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_list_item, parent, false)
        return CategoryHolder(view)
    }

    override fun onBindViewHolder(holder: CategoryHolder, position: Int) {
        val employee: Category? = employeeList[position]
        holder.name.text = employee?.getName()
    }

    override fun getItemCount(): Int {
        return employeeList.size
    }
}