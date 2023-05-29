package com.Collection.Dto;

public class EmployeeAddressDto {

	private long id;
	private String address;
	private String state;
	private String city;
	private long pincode;
	private String district;

	private EmployeeDto empDto;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getPincode() {
		return pincode;
	}

	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public EmployeeDto getEmpDto() {
		return empDto;
	}

	public void setEmpDto(EmployeeDto empDto) {
		this.empDto = empDto;
	}

}
