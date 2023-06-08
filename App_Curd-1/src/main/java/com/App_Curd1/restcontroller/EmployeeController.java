package com.App_Curd1.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.App_Curd1.entity.Employee;
import com.App_Curd1.services.EmployeeServiceimpl;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	  @Autowired
	    private EmployeeServiceimpl employeeService;

	    @GetMapping("/")
	    public List<Employee> getAllEmployees() {
	        return employeeService.getAllEmployees();
	    }

	    @GetMapping("/{id}")
	    public Employee getEmployeeById(@PathVariable Long id) {
	        return employeeService.getEmployeeById(id);
	    }

	    @PostMapping("/")
	    public Employee saveEmployee(@RequestBody Employee employee) {
	        return employeeService.saveEmployee(employee);
	    }

	    @PutMapping("/{id}")
	    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
	        Employee emp = employeeService.getEmployeeById(id);
	        if (emp != null) {
	            emp.setName(employee.getName());
	            emp.setEmail(employee.getEmail());
	            return employeeService.saveEmployee(emp);
	        } else {
	            return null;
	        }
	    }

	    @DeleteMapping("/{id}")
	    public void deleteEmployee(@PathVariable Long id) {
	        employeeService.deleteEmployee(id);
	    }
}
