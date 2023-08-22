package com.example.electronic_frontend.retrofit

import com.example.electronic_frontend.model.Category
import retrofit2.Call
import retrofit2.http.GET
import java.util.Optional





interface CategoryApi {

    @GET("/category")
    fun getAllEmployees(): Call<List<Category?>?>?

}