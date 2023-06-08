package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.D;
import com.example.demo.service.Dservice;
@Controller
public class Dcontroll {
	
	@Autowired
	private Dservice dserv;

	@RequestMapping("/abb")
	 public String newuser() {
		 return "d";
	 }
	@RequestMapping("save")
	public String savedata(D d) {
		dserv.saveEmployee(d);
		return "d";
	}
    @GetMapping("/abd")
    public List<D> getAllEmployees() {
    	
        return  dserv.getAllD();
    }

    @GetMapping("/ssd{id}")
    public D getEDById(@PathVariable Long id) {
        return dserv.getEmployeeById(id);
    }

    @PostMapping("/der")
    public D saveD(@RequestBody D d) {
        return dserv.saveEmployee(d);
    }

    @PutMapping("/delete{id}")
    public D updateEmployee(@PathVariable Long id, @RequestBody D employee) {
        D emp  = dserv.getEmployeeById(id);
        if (emp != null) {
            emp.setName(employee.getName());
            emp.setEmail(employee.getEmail());
            return dserv.saveEmployee(emp);
        } else {
            return null;
        }
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Long id) {
    dserv.deleteEmployee(id);
    }
}
