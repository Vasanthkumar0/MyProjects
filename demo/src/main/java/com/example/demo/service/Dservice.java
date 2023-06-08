package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.D;


@Service
public interface Dservice {
	 List<D> getAllD();
	 D getEmployeeById(Long id);
	   D saveEmployee(D d);
	    void deleteEmployee(Long id);
}
