package com.App_Crud.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.App_Crud.Entity.SignupEntity;
import com.App_Crud.Repository.SignupRepository;

@Service
public  class SignupServiceImpl implements SignupService{

	
	@Autowired
	private SignupRepository Signuprepository;

	@Override
	public String  saveSignup(String username, String password) {
		String response=null;
		
		try {	
		
	
		if(!username.isEmpty() && !password.isEmpty()) {
			
			SignupEntity entity=new SignupEntity();
		
		entity.setUserName(username);
		entity.setPassword(password);
		Signuprepository.save(entity);
		
		response="success";
		}
		else {
			response="failed";
		}
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return response;
	}

	@Override
	public String loginValidation(String username, String password) {
		String result = null;
		

		
		
		if(username.equalsIgnoreCase(Signuprepository.getUserName(username)) &&password.equalsIgnoreCase(Signuprepository.getPassword(password))){
			
			result = "login successful";
		} else {
			result = "login failed";
		}
			return result;
		}

	
}
		
	
	
	

	
	


