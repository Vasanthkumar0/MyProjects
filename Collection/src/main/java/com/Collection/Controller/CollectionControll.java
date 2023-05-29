package com.Collection.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Collection.Dto.CollectionCommonDto;
import com.Collection.Dto.EmployeeDto;
import com.Collection.Dto.ResponseDto;
import com.Collection.Service.ListService;

@RestController
public class CollectionControll {

	@Autowired
	private ListService listService;

	@RequestMapping(value = "/savelink", method = RequestMethod.POST)
	public ResponseEntity<?> saveList(@RequestBody CollectionCommonDto likedList) {
		ResponseDto<?> dto = listService.savenew(likedList);
		return new ResponseEntity<ResponseDto<?>>(dto, HttpStatus.OK);

	}

	@RequestMapping(value = "/getLinked", method = RequestMethod.GET)
	public ResponseEntity<?> getlinked(@RequestParam String name) {
		ResponseDto<?> dto = listService.getLinked(name);
		return new ResponseEntity<ResponseDto<?>>(dto, HttpStatus.OK);

	}

	@RequestMapping(value = "/saveEmployee", method = RequestMethod.POST)
	public ResponseEntity<?> saveEmplyee(@RequestBody CollectionCommonDto arrayList) {
		ArrayList<EmployeeDto> request = arrayList.getEmployee();
  		ResponseDto<?> dto = listService.saveNewEmployee(request);
		return new ResponseEntity<ResponseDto<?>>(dto, HttpStatus.OK);

	}

	@RequestMapping(value = "/getEmplyee", method = RequestMethod.GET)
	public ResponseEntity<?> getEmployee(@RequestParam String name) {
		ResponseDto<?> dto = listService.getEmployee(name);
		return new ResponseEntity<ResponseDto<?>>(dto, HttpStatus.OK);

	}

	@RequestMapping(value = "/getInfo", method = RequestMethod.GET)
	public ResponseEntity<?> getEmployeeState(@RequestParam String name, @RequestParam String state) {
		ResponseDto<?> dto = listService.getEmployeeInfo(name, state);
		return new ResponseEntity<ResponseDto<?>>(dto, HttpStatus.OK);

	}

	
	@RequestMapping(value = "/putcoll", method = RequestMethod.POST)
	public ResponseEntity<?> saveCollection(@RequestBody String personMap) {
		ResponseDto<?> dto = listService.savePerson(personMap);
		return new ResponseEntity<ResponseDto<?>>(dto, HttpStatus.OK);

	}
	@RequestMapping(value = "/getCollection", method = RequestMethod.GET)
	public ResponseEntity<?> getCollection() {
		ResponseDto<?> dto = listService.getPerson();
		return new ResponseEntity<ResponseDto<?>>(dto, HttpStatus.OK);

	}
}
