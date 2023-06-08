package com.App.DTO;

public class UserDto {

	
	
	private String name;
	private String email;
	private String city;
	
	
	public UserDto(String name, String email, String city) {
		super();
		this.name = name;
		this.email = email;
		this.city = city;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}
	
	
	
	
}
