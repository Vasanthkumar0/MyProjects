package com.Employee.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.Employee.Services.EmployeeService;




@Controller
public class EmployeeController {

	@Autowired
	EmployeeService employeeservice;
	
	@RequestMapping(value ="/save",method = RequestMethod.GET)
	public ModelAndView editPage(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView ref=new ModelAndView("employee");
		return ref;	
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ResponseEntity<String> newuser(HttpServletRequest req ,HttpServletResponse res) {
		String result = employeeservice.save(req);
		System.err.println(result);
		return new ResponseEntity<String>(result, HttpStatus.OK);
	}

}
