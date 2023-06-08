package com.App_Curd2.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.App_Curd2.entity.Employee;
import com.App_Curd2.services.EmployeeService;



@Controller

public class EmployeeControll {

	@Autowired
	private EmployeeService empserv;
	
	
	@RequestMapping("/Hi")
	private  String newemp() {
		return "abc";
	}
	

	
	
	
	@PostMapping("/saveEmployee")
	public String saveEmployee(@ModelAttribute("employee") Employee employee) {
	empserv.saveEmployee(employee);
	return "new_employee";
	} 
	
	@PutMapping("/showFormForUpdate/{id}")
	public String formupdate(@PathVariable (value ="id") long id,Model model) {
		Employee employee = empserv.getEmployeeById(id);
		model.addAttribute("employee", employee);
		return "update_employee";
	}
	
	@DeleteMapping("/deleteEmployee/{id}")
	public String deleteEmployee(@PathVariable (value ="id") long id) {
		this.empserv.deleteEmployeeById(id);
		return "index";
	}
	
/**	@GetMapping("/page/{pageNo}")
	public String findpaginated(@PathVariable (value="pageNo") int pageNo ,
			@RequestParam("sortfield")String sortField,
			@RequestParam("sortDirection") String sortDirection,
			Model model) {
		int pageSize= 5;
		
		Page<Employee> page = empserv.findPagination(pageNo, pageSize, sortField, sortDirection);
		List<Employee> listEmployee =page.getContent();
		
		 
		model.addAttribute("currentPage", pageNo);
		model.addAttribute("totalPages", page.getTotalPages());
		model.addAttribute("totalItems", page.getTotalElements());
		
		model.addAttribute("sortField", sortField );
		model.addAttribute("sortDirection", sortDirection);
		model.addAttribute("reverseSortdir", sortDirection.equals("asc")? "desc":"asc");
		
		model.addAttribute("listEmployees", listEmployee);
		return "index";
 	}*/
}
