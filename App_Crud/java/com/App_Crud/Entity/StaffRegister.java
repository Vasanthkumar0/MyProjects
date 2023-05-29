package com.App_Crud.Entity;

import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Table(name="staffs")
public class StaffRegister {
	@Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long id;

	  @Column(name = "first_name")
	  private String firstName;

	  @Column(name = "last_name")
	  private String lastName;

	  @Column(name = "email")
	  private String email;

	  @Column(name = "phone_number")
	  private String phoneNumber;

	  @Column(name = "staff_id")
	  private String staffID;

	  @Column(name = "department")
	  private String department;

	  @Column(name = "job_title")
	  private String jobTitle;

	  @Column(name = "start_date")
	  private String startDate;

	  @Column(name = "staff_adderss")
	  private String staffAddress;
	  
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getStaffID() {
		return staffID;
	}

	public void setStaffID(String staffID) {
		this.staffID = staffID;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getStaffAddress() {
		return staffAddress;
	}

	public void setStaffAddress(String staffAddress) {
		this.staffAddress = staffAddress;
	}

	

}
