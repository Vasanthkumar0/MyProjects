package com.Employee.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Employee.Entity.EmployeeRegisterEntity;


@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeRegisterEntity, Long> {

}
