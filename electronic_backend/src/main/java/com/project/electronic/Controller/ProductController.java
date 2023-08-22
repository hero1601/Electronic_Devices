package com.project.electronic.Controller;

import com.project.electronic.Model.Product;
import com.project.electronic.Repository.ProductRepository;
import com.project.electronic.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping(path = "/product/{id}")
    public Optional<Product> getProductById(@PathVariable Integer id){
        return productService.getProductById(id);
    }

    @GetMapping(path = "/product")
    public List<Product> getProductByCategoryId(@RequestParam Integer category_id){
        return productService.getProductByCategoryId(category_id);
    }

}
