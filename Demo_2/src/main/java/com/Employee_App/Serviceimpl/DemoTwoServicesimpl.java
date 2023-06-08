package com.Employee_App.Serviceimpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Employee_App.Dto.DemoSecDto;
import com.Employee_App.Entity.DemoTwoEntity;
import com.Employee_App.Repository.DemoTwoRepository;
import com.Employee_App.Service.DemoTwoService;


@Service
public class DemoTwoServicesimpl implements DemoTwoService {

	@Autowired
	private DemoTwoRepository demoTwoRepository;
	
	
	@Override
	public String  newonw(DemoSecDto demoDto) {
		
		DemoTwoEntity demotwoentity=new DemoTwoEntity();
		demotwoentity.setName(demoDto.getName());
		demotwoentity.setDepartment(demoDto.getDepartment());
		demotwoentity.setAddress(demoDto.getAddress());
		demoTwoRepository.save(demotwoentity);
		
		System.err.println(demoDto.getName());
		System.err.println(demoDto.getAddress());
		System.err.println(demoDto.getDepartment());
		return "saved";
	}


	@Override
	public DemoTwoEntity getdata(String name) {
		
		DemoTwoEntity response  =	demoTwoRepository.findByName(name);
		
		
		return response;
	}

	
	
}
