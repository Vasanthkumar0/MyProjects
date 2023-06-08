package com.TwoDataBase.sec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.TwoDataBase.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product , Long> {

}
