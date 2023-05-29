package com.map.repsitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.map.entity.Emp;

public interface EmpRepository extends JpaRepository<Emp, Long> {

}
