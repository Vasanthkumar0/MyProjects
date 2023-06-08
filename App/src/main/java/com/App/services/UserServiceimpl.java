package com.App.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.App.DTO.UserDto;
import com.App.entity.User;
import com.App.repository.UserRepository;


@Service
public class UserServiceimpl implements UserService {

	@Autowired
	private UserRepository rpo;

	
	@Override
	public void saveuser(User user) {
		//rpo.save(user);
	}

	@Override
	public void saveuser(UserDto userdto) {

		User entity = new User();
	
		entity.setName(userdto.getName());
		entity.setEmail(userdto.getEmail());
		entity.setCity(userdto.getCity());
 	
		rpo.save(entity);
	
	}

}
