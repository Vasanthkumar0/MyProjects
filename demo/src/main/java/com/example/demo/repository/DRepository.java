package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.D;

public interface DRepository extends JpaRepository<D, Long> {

}
