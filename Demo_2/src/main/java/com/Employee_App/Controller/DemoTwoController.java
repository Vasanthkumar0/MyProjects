package com.Employee_App.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Employee_App.Dto.DemoSecDto;
import com.Employee_App.Entity.DemoTwoEntity;
import com.Employee_App.Service.DemoTwoService;


@RestController
public class DemoTwoController {

	@Autowired
	private DemoTwoService demoTwoService;
	
	
	@RequestMapping(value = "/hello" ,method = RequestMethod.POST)
	public String ViewAll(@RequestBody DemoSecDto demoDto) {
		String save = demoTwoService.newonw(demoDto);
		return save;
	}
	@RequestMapping(value = "/getdata" ,method = RequestMethod.GET)
	public ResponseEntity<DemoTwoEntity> getData(@RequestParam String name) {
		DemoTwoEntity save = demoTwoService.getdata(name);
		return new ResponseEntity<DemoTwoEntity>(save, HttpStatus.OK);
	}
}
