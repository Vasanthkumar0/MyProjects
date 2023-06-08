package com.App_Curd2.services;

import java.util.*;

import com.App_Curd2.entity.Employee;


public interface EmployeeService {
	
 List<Employee> getAllEmployees();
 void saveEmployee(Employee employee);
 Employee getEmployeeById(long id);
 void deleteEmployeeById(long id);
// Page<Employee> findPagination(int pageNo,int pageSize , String sortField,String sortDirection);
}
