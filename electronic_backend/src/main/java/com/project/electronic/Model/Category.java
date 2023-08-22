package com.project.electronic.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "category")
public class Category {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer Id;
    @Column(name = "Name")
    private String Name;

    @OneToMany(mappedBy = "category")
    private List<Product> products;

    public Integer getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public void setName(String name) {
        Name = name;
    }
}
