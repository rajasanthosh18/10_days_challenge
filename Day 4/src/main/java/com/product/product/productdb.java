package com.product.product;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface productdb extends JpaRepository<Product,Integer> {
    Product findByName(String name);

    List<Product> findAllByPlace(String place);

    @Query
    (
        value = " SELECT * FROM PRODUCT WHERE WARRANTY < :curYear",
        nativeQuery = true
    )
    List<Product> getOutOfWan(@Param("curYear")int curYear);
}
