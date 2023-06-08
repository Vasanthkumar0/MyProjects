package com.App_Curd1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.App_Curd1.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
