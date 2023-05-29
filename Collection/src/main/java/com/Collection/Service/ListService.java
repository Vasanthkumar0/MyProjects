package com.Collection.Service;

import com.Collection.Dto.ResponseDto;

import java.util.ArrayList;
import java.util.Map;

import com.Collection.Dto.CollMap;
import com.Collection.Dto.CollectionCommonDto;
import com.Collection.Dto.EmployeeDto;

public interface ListService {

	ResponseDto<?> savenew(CollectionCommonDto likedList);

	ResponseDto<?> getLinked(String name);

	ResponseDto<?> saveNewEmployee(ArrayList<EmployeeDto> request);

	ResponseDto<?> getEmployee(String name);

	ResponseDto<?> getEmployeeInfo(String name, String state);



	ResponseDto<?> getPerson();

	ResponseDto<?> savePerson(String personMap);

	ResponseDto<?> getEmployeeInfoV(String name, String state);

	ResponseDto<?> getEmployeeInfo2(String name, String state);

}
