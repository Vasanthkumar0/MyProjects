package com.map.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.map.Dto.AddDto;
import com.map.Dto.EmpDto;
import com.map.entity.Adrs;
import com.map.entity.Emp;
import com.map.repsitory.AddressRepository;
import com.map.repsitory.EmpRepository;


@Service
public class ServiceImpl implements Services {

	
	
	@Autowired
	private EmpRepository repo;

	
	Adrs adres;
	
	@Override
	public void saveall(EmpDto adrs) {
		
		Emp emp=new Emp();
		
	
		repo.save(emp);
		
		
	}
	
	

}
