package com.example.electronic_frontend.retrofit

import com.google.gson.Gson
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class RetrofitService {

    private var retrofit: Retrofit? = null

    fun RetrofitService() {
        initializeRetrofit()
    }

    private fun initializeRetrofit() {
        retrofit = Retrofit.Builder()
            .baseUrl("http://172.25.24.37:9000")
            .addConverterFactory(GsonConverterFactory.create(Gson()))
            .build()
    }

    fun getRetrofit(): Retrofit? {
        return retrofit
    }
}