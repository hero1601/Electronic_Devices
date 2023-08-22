package com.project.electronic.Service;

import com.project.electronic.Model.Product;
import com.project.electronic.Repository.ProductRepository;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Optional<Product> getProductById(Integer id){
        return productRepository.findById(id);
    }

    //Filter products according to category_id
    public List<Product> getProductByCategoryId(Integer id){
        return productRepository.findProductByCategoryId(id);
    }


}
