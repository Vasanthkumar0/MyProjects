package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.D;
import com.example.demo.repository.*;

public class Dserviceimpl implements Dservice{

	@Autowired
	private DRepository drepo;
	
	@Override
	public List<D> getAllD() {
		
		return drepo.findAll();
	}

	@Override
	public D getEmployeeById(Long id) {
		return drepo.findById(id).orElse(null);
	}

	@Override
	public D saveEmployee(D d) {
		
		return drepo.save(d);
	}

	@Override
	public void deleteEmployee(Long id) {
	drepo.deleteById(id);	
	}

}
