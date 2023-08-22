package com.example.electronic_frontend.model

class Product_Variant {

    private val sku: Int? = null

    private val Name: String? = null

    private val price: Int? = null

    var product: Product? = null

    private val Quantity: Int? = null

    fun getSku(): Int? {
        return sku
    }

    fun getName(): String? {
        return Name
    }

    fun getPrice(): Int? {
        return price
    }

    fun getProduct_id(): Int? {
        return product!!.getId()
    }

    fun getQuantity(): Int? {
        return Quantity
    }

}