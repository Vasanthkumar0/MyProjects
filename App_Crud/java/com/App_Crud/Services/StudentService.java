package com.App_Crud.Services;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.App_Crud.DTO.StudentDto;
import com.App_Crud.Entity.Student;

public interface StudentService {
	
	List<StudentDto> getAll();
	String save(HttpServletRequest req);
	String edit(HttpServletRequest request);
	String deleteByName(long id) ;
	/*
	 * String savestaff(HttpServletRequest request);
	 */
	
	
	
}
