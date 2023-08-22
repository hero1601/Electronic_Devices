package com.project.electronic.Controller;

import com.project.electronic.Model.Product_Variant;
import com.project.electronic.Service.Product_VariantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/")
public class Product_VariantController {

    @Autowired
    private Product_VariantService product_variantService;

    @GetMapping(path = "/product_variant")
    public List<Product_Variant> getAllProduct_VariantInsideAProduct(@RequestParam Integer product_id){
        return product_variantService.findProductVariantAccToProductId(product_id);
    }

    @GetMapping(path = "/product_variant/{sku}")
    public Optional<Product_Variant> getProduct_VariantBySku(@PathVariable Integer sku){
        return product_variantService.findBySku(sku);
    }

}

