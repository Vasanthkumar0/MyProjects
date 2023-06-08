package com.App_Employee.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employee" )
public class EmployeeEntity {

	
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	 	@Column(name = "name")
	 	private String name;
		
		  @OneToOne(mappedBy = "employeeDetailsEntity", cascade = CascadeType.ALL)
		 private EmployeeDetailsEntity employeeDetailsEntity;
		 
		 

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





	
	 public EmployeeDetailsEntity getEmployeeDetailsEntity() { return
 employeeDetailsEntity; }
	
	 
	 
	  public void setEmployeeDetailsEntity(EmployeeDetailsEntity
	 employeeDetailsEntity) { this.employeeDetailsEntity = employeeDetailsEntity;
	 }
	 

}
