package com.App_shop.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.App_shop.Dto.CustomerDto;
import com.App_shop.Entity.Customer;
import com.App_shop.Service.OrderService;

@RestController
public class OrderControll {
	
	
	@Autowired
	private OrderService orderService;
	
	
	@RequestMapping(value = "/saveapi123" ,method = RequestMethod.POST)
	public ResponseEntity<CustomerDto> placeorder(@RequestBody CustomerDto customerdto) {
		
	orderService.saveuser(customerdto);
		
		
		return ResponseEntity.ok(customerdto);
		
	}
	
	
	@RequestMapping(value = "/getUser", method = RequestMethod.GET)
	public List<Customer> getPersonsByName(@RequestParam(name = "name") String name) {

		List<Customer> demo = orderService.getUserdata(name);
		return demo;
	}
	

}
