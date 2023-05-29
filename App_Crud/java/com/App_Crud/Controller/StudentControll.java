package com.App_Crud.Controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.App_Crud.DTO.StudentDto;
import com.App_Crud.Entity.Student;
import com.App_Crud.Repository.StudentRepository;
import com.App_Crud.Services.SignupService;

import com.App_Crud.Services.StudentService;
import com.App_Crud.Services.StudentServiceimpl;

@Controller

public class StudentControll {
	
	@Autowired
	StudentRepository studentrepositry;
	
	@Autowired
	StudentService studentService;
	@Autowired
	SignupService signservice;

	@RequestMapping(value = "home", method = RequestMethod.GET)
	public String home() {
		return "HomePage";
	}
	

	@RequestMapping(value = "addnew", method = RequestMethod.GET)
	public String add() {
		return "add_student";
	}

	
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String loginpage() {
		return "login";
	}

	@RequestMapping(value = "/Signup", method = RequestMethod.GET)
	public String newuser() {
		return "Signup";
	}

	@RequestMapping(value = "/about", method = RequestMethod.GET)
	public String about() {
		return "about";
	}
	/*
	 * @RequestMapping(value = "new_staff", method = RequestMethod.GET) public
	 * String staff() { return "new_staff"; }
	 */
	
	@RequestMapping(value = "/newUser", method = RequestMethod.POST)
	public ResponseEntity<String> newuser(@RequestParam("username") String username,
			@RequestParam("password") String password) {
		String result = signservice.saveSignup(username, password);
		System.err.println(result);
		return new ResponseEntity<String>(result, HttpStatus.OK);
	}

	@RequestMapping(value = "/loginvalidation", method = RequestMethod.GET)
	public ResponseEntity<String> logincheck(@RequestParam(name = "username") String username,
			@RequestParam(name = "password") String password) {
		String result = signservice.loginValidation(username, password);
		System.err.println(result);
		return new ResponseEntity<String>(result, HttpStatus.OK);
	}

	
	 @RequestMapping(value="/register",method=RequestMethod.POST) 
	 public  ModelAndView register(HttpServletRequest Req,HttpServletResponse Res) {
		
	  ModelAndView mv=new ModelAndView("add_student");
	  String  newuser = studentService.save(Req);
	  System.err.println(newuser);
	  return mv;
	  
	 
	 }
	 
		/*
		 * @RequestMapping(value="/saveStaff",method=RequestMethod.POST) public
		 * ResponseEntity<String> staffregister(HttpServletRequest
		 * request,HttpServletResponse response) {
		 * 
		 * 
		 * String newstaff = studentService.savestaff(request);
		 * System.err.println(newstaff); return new
		 * ResponseEntity<String>(newstaff,HttpStatus.OK);
		 * 
		 * 
		 * }
		 */
	 

	 @RequestMapping(value="/ajaxTable",method= RequestMethod.GET)
		public String ajaxTable()
		{
			return "ajaxtable";
			
		}
		
		
		
		
		
	
	@RequestMapping(value ="/getStudentData",method = RequestMethod.GET)
	public ResponseEntity<List<StudentDto>> getDataTable() {
		 List<StudentDto> dtolist=studentService.getAll();
		return new ResponseEntity<List<StudentDto>>(dtolist,HttpStatus.OK);	
	}



		
		
		  @RequestMapping(value="/studentUpdate",method = RequestMethod.POST)
			public ModelAndView edit(HttpServletRequest request,HttpServletResponse response) {
				String result="";
				ModelAndView ref=null;
				result= studentService.edit(request);
				if (result.equals("Updated Successfully")) {
					ref=new ModelAndView("ajaxtable");
				}
				return ref;	
			}
		  
			
		  @RequestMapping(value ="/delete",method = RequestMethod.POST)
		  public ResponseEntity<String> deleteByName(@RequestParam("id") long id) {
		  	String result="";
		  	 result=studentService.deleteByName(id);
		  	return new ResponseEntity<String>(result,HttpStatus.OK);	
		  }

		  
	/*
	 * @GetMapping("/list") public String getUsers(Model model) { List<Student>
	 * student = studentrepositry.findAll(); model.addAttribute("studends",
	 * student); return "List"; }
	 
	 * @GetMapping("/list") public String getUsers(Model model) { List<Student>
	 * student = studentrepositry.findAll(); model.addAttribute("studends",
	 * student); return "List"; }
	 *
	 * @GetMapping("/student-delete/{id}") public ModelAndView
	 * deleteStaff(@PathVariable("id") Integer id) { Student deleteStaff =
	 * studentService.getById(id); studentService.delete(deleteStaff); retu
	 * 
	 * }
	 */

}
