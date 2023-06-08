package com.App_Employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.App_Employee.Entity.EmployeeEntity;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {

}
