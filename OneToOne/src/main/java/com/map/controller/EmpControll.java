package com.map.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.map.Dto.EmpDto;

import com.map.services.Services;


@Controller
public class EmpControll {
	@Autowired
	private Services services;
	
	
	@RequestMapping(value = "/saveAll" , method = RequestMethod.POST)
	public ResponseEntity<EmpDto> save(@RequestBody EmpDto adrs){
		
		services.saveall(adrs);
		
		
		return ResponseEntity.ok(adrs) ;
		
	}
}
