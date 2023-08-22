package com.project.electronic.Repository;

import com.project.electronic.Model.Product;
import com.project.electronic.Model.Product_Variant;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Product_VariantRepository extends CrudRepository<Product_Variant,Integer> {

    @Query(value = "SELECT * FROM product_variant prod_v where prod_v.product_id=:product_id order by prod_v.price",nativeQuery = true)
    public List<Product_Variant> findProductVariantByProductId(@Param("product_id") Integer product_id);

}
