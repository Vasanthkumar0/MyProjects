package com.App.services;

import com.App.DTO.UserDto;
import com.App.entity.User;

public interface UserService {

	public void saveuser(User user);

	public void saveuser(UserDto userdto);
}
