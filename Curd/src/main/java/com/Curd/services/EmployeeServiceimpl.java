package com.Curd.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Curd.entity.Employee;
import com.Curd.repository.EmployeeRepository;

@Service
public class EmployeeServiceimpl implements EmployeeService {

	@Autowired
	private EmployeeRepository repo;
	
	
	@Override
	public void savedata(Employee emp) {
		repo.save(emp);

	}

}
