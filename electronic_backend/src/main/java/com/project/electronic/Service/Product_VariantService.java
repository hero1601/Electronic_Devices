package com.project.electronic.Service;

import com.project.electronic.Model.Product;
import com.project.electronic.Model.Product_Variant;
import com.project.electronic.Repository.Product_VariantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class Product_VariantService {
    @Autowired
    private Product_VariantRepository product_variantRepository;

    //On clicking the product it would provide all the product variant inside it sorted by price
    public List<Product_Variant> findProductVariantAccToProductId(Integer product_id){
        return product_variantRepository.findProductVariantByProductId(product_id);
    }


    //On clicking the product_variant it would provide us with all its details
    public Optional<Product_Variant> findBySku(Integer sku){
        return product_variantRepository.findById(sku);
    }

}
