package com.App_shop.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.App_shop.Entity.Product;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {


}
