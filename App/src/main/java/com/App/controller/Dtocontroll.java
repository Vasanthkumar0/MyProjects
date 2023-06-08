package com.App.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.App.DTO.UserDto;
import com.App.entity.User;
import com.App.repository.UserRepository;
import com.App.services.UserService;

@RestController
@RequestMapping("/vasanth")
public class Dtocontroll {
	
	@Autowired
	UserService service;
	
	@Autowired
	UserRepository userrepo;

	@GetMapping("/getall")
	public List<User>getall(){
		List<User>curd=userrepo.findAll();
		return curd;
	}
	
	
		
	@PostMapping("/kumar")
	public UserDto save(@RequestBody UserDto userdto) {
		service.saveuser(userdto);
		return userdto;
	}
	 @PostMapping("/uploadFile")
	    public String uploadFile(@RequestParam("abc") MultipartFile file) {
	        return file.getName();
	    }
	
}
