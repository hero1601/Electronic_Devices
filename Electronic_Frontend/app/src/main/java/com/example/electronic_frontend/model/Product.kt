package com.example.electronic_frontend.model

class Product {


    private var productid: Int? = null

    private var productname: String? = null

    private var productDescription: String? = null


    //private val product_variants: List<Product_Variant>? = null

    fun getId(): Int? {
        return productid
    }

    fun getName(): String? {
        return productname
    }

    fun getDescription(): String? {
        return productDescription
    }


    fun setId(id: Int?) {
        productid = id
    }

    fun setName(name: String?) {
        productname = name
    }

    fun setDescription(description: String?) {
        productDescription = description
    }


}