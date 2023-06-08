package com.App_Employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.App_Employee.Entity.EmployeeDetailsEntity;

public interface EmployeeDetailsRepository extends JpaRepository<EmployeeDetailsEntity, Long> {

}
