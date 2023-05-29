package com.Collection.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.Collection.Dto.EmployeeAddressDto;

@Entity
@Table(name = "Employee")
public class EmployeeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	@Column(name = "name")
	private String name;

	@OneToMany(mappedBy = "employeeEntity", cascade = CascadeType.ALL)
	private List<EmployeeAddressEntity> employee;

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

	public List<EmployeeAddressEntity> getEmployee() {
		return employee;
	}

	public void setEmployee(List<EmployeeAddressEntity> employee) {
		this.employee = employee;
	}


	

}
