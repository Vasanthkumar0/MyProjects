package com.App_Crud.Services;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.App_Crud.DTO.StudentDto;
import com.App_Crud.Entity.StaffRegister;
import com.App_Crud.Entity.Student;
import com.App_Crud.Repository.StaffRepository;
import com.App_Crud.Repository.StudentRepository;

@Service
public class StudentServiceimpl implements StudentService{

	@Autowired
	StudentRepository studentRepository;
	
	@Autowired
	StaffRepository staffrepo;

//	@Override
//	public void save(Student student) {
//		if (student.getId() == null) {
//			studentRepository.save(student);
//		} else {
//			Student staffUpdate = studentRepository.findById(student.getId()).get();
//			staffUpdate.setName(student.getName());
//			staffUpdate.setRollNo(student.getRollNo());
//			staffUpdate.setEmailId(student.getEmailId());
//			studentRepository.save(staffUpdate);
//		}
//	}

	

	/*
	 * @Override public Student getById(Integer id) { return
	 * studentRepository.findById(id).get();
	 * 
	 * }
	 */

	/*
	 * @Override public void delete(Student student) {
	 * studentRepository.delete(student); }
	 */

	@Override
	public String save(HttpServletRequest req) {{
		String response=null;
		try {
			
				Student student=new Student();
				student.setName(req.getParameter("name"));
				student.setRollNo(req.getParameter("rollNo"));
				student.setEmailId(req.getParameter("email"));
				student.setAddress(req.getParameter("address"));
				student.setMobile(req.getParameter("mobile"));
				student.setAge(req.getParameter("age"));
				student.setGender(req.getParameter("gender"));
				student.setDepartment(req.getParameter("department"));
				
				String img  = req.getParameter("file");
				
				String das = Base64.getEncoder().encodeToString(img.getBytes());
				
				student.setFile(das);
		
				System.err.println(student.getFile());
				
				
				String cc =   new String(Base64.getDecoder().decode(student.getFile().getBytes()));
				
				System.err.println(cc);
				
//				student.setFile(req.getParameter("file")); 
				
				studentRepository.save(student);
				
				response="success";
		
		} catch (Exception e) {
			e.printStackTrace();
			response="failure";
		}
		
		return response;
		
		
	}
	}

	@Override
	public List<StudentDto> getAll() {
		List<Student> findAll = studentRepository.findAll();
		List<StudentDto> dto1=new ArrayList<>();
		
		for(Student Data:findAll) {
			StudentDto dto=new StudentDto();
			dto.setId(Data.getId());
			dto.setName(Data.getName());
			dto.setRollNo(Data.getRollNo());
			dto.setEmailId(Data.getEmailId());
			dto.setAddress(Data.getAddress());
			dto.setMobile(Data.getMobile());
			dto.setAge(Data.getAge());
			dto.setGender(Data.getGender());
			dto.setDepartment(Data.getDepartment());
			dto.setFile(Data.getFile()); 
			
			dto1.add(dto);
			
		}
		return dto1;
	}

	@Override
	public String edit(HttpServletRequest request) {
		String result="";

		try {		
			Student entity=studentRepository.getDataById(request.getParameter("id"));
			
			if(entity != null) {
			entity.setId(request.getParameter("id"));
			entity.setName(request.getParameter("name"));
			entity.setRollNo(request.getParameter("rollNo"));	
			entity.setEmailId(request.getParameter("emailId"));
			entity.setAddress(request.getParameter("address"));
			entity.setMobile(request.getParameter("mobile"));
			entity.setAge(request.getParameter("age"));
			entity.setGender(request.getParameter("gender"));
			if(request.getParameter("department") != null && request.getParameter("department") != "" ) {
			entity.setDepartment(request.getParameter("department"));
			}
			
			entity.setFile(request.getParameter("file")); 
			studentRepository.save(entity);
			result="Updated Successfully";
		}} catch (Exception e) {
			e.printStackTrace();
			result="Exception occurred";
		}
		return result	;

	}

	@Override
	public String deleteByName(long id) {
		String result = "";
		try {
			studentRepository.deleteById(id);
			result = "deleted successfully";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;

	

}

/*
 * @Override public String savestaff(HttpServletRequest request) { String
 * response=null; try {
 * 
 * StaffRegister staff=new StaffRegister();
 * staff.setFirstName(request.getParameter("firstName"));
 * staff.setLastName(request.getParameter("lastName"));
 * staff.setEmail(request.getParameter("email"));
 * staff.setPhoneNumber(request.getParameter("phoneNumber"));
 * staff.setStaffID(request.getParameter("staffID"));
 * staff.setDepartment(request.getParameter("department"));
 * staff.setJobTitle(request.getParameter("jobTitle"));
 * staff.setStartDate(request.getParameter("startDate"));
 * staff.setStaffAddress(request.getParameter("address"));
 * 
 * staffrepo.save(staff); response="success";
 * 
 * 
 * } catch (Exception e) { e.printStackTrace(); response="failure"; }
 * 
 * return response;
 * 
 * 
 * 
 * 
 * }
 */
	
	
}