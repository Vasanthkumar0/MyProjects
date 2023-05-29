package com.Collection.Dto;

import java.util.ArrayList;

public class EmployeeDto {

	private long id;
	private String name;

	private ArrayList<EmployeeAddressDto> address;

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

	public ArrayList<EmployeeAddressDto> getAddress() {
		return address;
	}

	public void setAddress(ArrayList<EmployeeAddressDto> address) {
		this.address = address;
	}

}
