package com.Curd_App1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Curd_App1.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
