package com.project.electronic.Repository;

import com.project.electronic.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {

    @Query(value = "SELECT * FROM product prod where prod.category_id=:category_id",nativeQuery = true)
    public List<Product> findProductByCategoryId(@Param("category_id") Integer category_id);

}
