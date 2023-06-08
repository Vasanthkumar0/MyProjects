package com.Employee.ServicesImpl;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Employee.Services.EmployeeService;
import com.Employee.Entity.*;
import com.Employee.Repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	
	@Override
	public String save(HttpServletRequest req) {
		String response="";
		try {
			
			EmployeeRegisterEntity employee=new EmployeeRegisterEntity();
			employee.setName(req.getParameter("name"));
			employee.setGender(req.getParameter("gender"));
			employee.setDepartment(req.getParameter("department"));
			employee.setProof(req.getParameter("proof"));
				
			employeeRepository.save(employee);
				response="success";
		
		} catch (Exception e) {
			e.printStackTrace();
			response="failure";
		}
		
		return response;
		
		
	}

}
