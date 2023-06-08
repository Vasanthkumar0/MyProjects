package com.App_shop.Dto;

import java.util.List;

import com.App_shop.Entity.Product;

public class CustomerDto {

	private long id;
	private String name;
	private String email;
	private String gender;
	
	private List<Product> prodect;
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<Product> getProdect() {
		return prodect;
	}
	public void setProdect(List<Product> prodect) {
		this.prodect = prodect;
	}


}
