package com.project.electronic.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer Id;
    @Column(name = "Name")
    private String Name;
    @Column(name = "Description")
    private String Description;

    @ManyToOne(targetEntity = Category.class)
    @JoinColumn(name = "Category_id")
    Category category;

    @OneToMany(mappedBy = "product")
    private List<Product_Variant> product_variants;

    public Integer getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public String getDescription() {
        return Description;
    }

    public Integer getCategoryById() {
        return category.getId();
    }

    public void setId(Integer id) {
        Id = id;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setCategory(Category new_category){
        category.setId(new_category.getId());
        category.setName(new_category.getName());
    }
}
