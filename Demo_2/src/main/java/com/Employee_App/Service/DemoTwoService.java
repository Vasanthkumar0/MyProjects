package com.Employee_App.Service;

import com.Employee_App.Dto.DemoSecDto;
import com.Employee_App.Entity.DemoTwoEntity;

public interface DemoTwoService {

	String newonw(DemoSecDto demoDto);

	DemoTwoEntity getdata(String name);

}
