package com.Employee_App.OneServicesImpl;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.Employee_App.Dto.DemoOneDto;
import com.Employee_App.OneServices.DemoOneService;


@Service
public class DemoOneServiceImpl implements DemoOneService {
	


	@Override
	public String save(DemoOneDto demoOneDto) {
		DemoOneDto DemoOneDto=new DemoOneDto();
		DemoOneDto.setName(demoOneDto.getName());
		DemoOneDto.setAddress(demoOneDto.getAddress());
		DemoOneDto.setDepartment(demoOneDto.getDepartment());
		
		RestTemplate restTemplate=new RestTemplate();
		String anotherapi = "http://localhost:8081/hello";
		ResponseEntity<String> response = restTemplate.postForEntity(anotherapi, DemoOneDto , String.class);
	    return response.getBody();
	}

	@Override
	public String viewdata(String name) {
		RestTemplate restTemplate=new RestTemplate();
		String anotherapi = "http://localhost:8081/getdata?name=" + name;
		ResponseEntity<String> response = restTemplate.getForEntity(anotherapi, String.class);
	    return response.getBody();
	}

	

}
