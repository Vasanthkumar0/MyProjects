package com.Curd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Curd.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
