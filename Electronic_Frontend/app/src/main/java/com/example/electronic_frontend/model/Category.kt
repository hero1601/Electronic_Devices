package com.example.electronic_frontend.model

class Category {

    private var categoryid: Int? = null


    private var categoryname: String? = null


    private val products: List<Product>? = null

    fun getId(): Int? {
        return categoryid
    }

    fun getName(): String? {
        return categoryname
    }

    fun setId(id: Int?) {
        categoryid = id
    }

    fun setName(name: String?) {
        categoryname = name
    }
}