package com.Collection.Dto;

import java.util.ArrayList;
import java.util.LinkedList;

public class CollectionCommonDto {

	private LinkedList<ListDto> request;

	private ArrayList<EmployeeDto> employee;

	public LinkedList<ListDto> getRequest() {
		return request;
	}

	public void setRequest(LinkedList<ListDto> request) {
		this.request = request;
	}

	public ArrayList<EmployeeDto> getEmployee() {
		return employee;
	}

	public void setEmployee(ArrayList<EmployeeDto> employee) {
		this.employee = employee;
	}

}
