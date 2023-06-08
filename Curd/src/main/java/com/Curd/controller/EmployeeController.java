package com.Curd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Curd.entity.Employee;
import com.Curd.repository.EmployeeRepository;
import com.Curd.services.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService serv;
	
	@Autowired
	private EmployeeRepository repo;
	
	@RequestMapping("/login")
	public String newdata() {
		return "employee";
	}
	@RequestMapping("/12345")
	 public String saveuser(Employee emp) {
		 serv.savedata(emp);
		 return "employee";
	 }
	@GetMapping("/employeesall")
	public String listProducts(Model model) {
	    List<Employee> productList = repo.findAll();
	    model.addAttribute("Employee", productList);
	    return "products/list";
	}
}
