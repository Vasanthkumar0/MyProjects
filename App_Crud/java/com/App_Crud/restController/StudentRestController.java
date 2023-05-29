/*
 * package com.App_Crud.restController;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.http.HttpStatus; import
 * org.springframework.http.ResponseEntity; import
 * org.springframework.web.bind.annotation.RequestBody; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RequestMethod; import
 * org.springframework.web.bind.annotation.RestController;
 * 
 * import com.App_Crud.DTO.StudentDto; import
 * com.App_Crud.Services.StudentService;
 * 
 * @RestController public class StudentRestController {
 * 
 * @Autowired StudentService studentService;
 * 
 * @RequestMapping(value = "/SaveStudent", method = RequestMethod.POST ) public
 * ResponseEntity<String> newdata(@RequestBody StudentDto dto) { String result =
 * studentService.saveStudent(dto); System.err.println(result); return new
 * ResponseEntity<String>(result, HttpStatus.OK); } }
 */