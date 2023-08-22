package com.example.electronic_frontend

import android.R
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.electronic_frontend.adapter.CategoryAdapter
import com.example.electronic_frontend.model.Category
import com.example.electronic_frontend.retrofit.CategoryApi
import com.example.electronic_frontend.retrofit.RetrofitService
import com.google.android.material.floatingactionbutton.FloatingActionButton
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class CategoryList : AppCompatActivity() {

    private var recyclerView: RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_item)

        recyclerView = findViewById(R.id.content);
        recyclerView?.layoutManager = LinearLayoutManager(this);

        loadCategory()

    }

    private fun loadCategory() {
        val retrofitService = RetrofitService()
        val employeeApi: CategoryApi =
            retrofitService.getRetrofit()!!.create(CategoryApi::class.java)
        employeeApi.getAllEmployees()
            ?.enqueue(object : Callback<List<Category?>?> {
                override fun onResponse(
                    call: Call<List<Category?>?>?,
                    response: Response<List<Category?>?>
                ) {
                    response.body()?.let { populateListView(it) }
                }

                override fun onFailure(call: Call<List<Category?>?>?, t: Throwable?) {
                    Toast.makeText(
                        this@CategoryList,
                        "Failed to load employees",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            })
    }

    private fun populateListView(employeeList: List<Category?>) {
        val employeeAdapter = CategoryAdapter(employeeList)
        recyclerView!!.adapter = employeeAdapter
    }

    override fun onResume() {
        super.onResume()
        loadCategory()
    }


}