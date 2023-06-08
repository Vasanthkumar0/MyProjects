package com.Employee_App.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Employee_App.Dto.DemoOneDto;
import com.Employee_App.OneServices.DemoOneService;

@RestController
public class DemoOneController {

	@Autowired
	private DemoOneService demoservice;
	
	
	@RequestMapping(value = "/Demo1" ,method = RequestMethod.POST)
	public String demo(@RequestBody DemoOneDto demoOneDto) {
	String demodd=	demoservice.save(demoOneDto);
		return demodd;
		
	}
	
	@RequestMapping(value = "/DemoOneGet" ,method = RequestMethod.GET)
	public String demoGet(@RequestParam String name) {
	String demo=	demoservice.viewdata(name);
	System.err.println(demo);
		return demo;
		
	}
	
}
