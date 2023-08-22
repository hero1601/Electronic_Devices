package com.project.electronic.Model;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;

@Entity
@Table(name = "product_variant")
public class Product_Variant {

    @Id
    private Integer sku;
    @Column(name = "Name")
    private String Name;
    @Column(name="Price")
    private Integer price;
    @ManyToOne
    @JoinColumn(name = "Product_Id")
    Product product;
    @Column(name = "Quantity")
    private Integer Quantity;

    public Integer getSku() {
        return sku;
    }

    public String getName() {
        return Name;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getProduct_id() {
        return product.getId();
    }

    public Integer getQuantity() {
        return Quantity;
    }
}
