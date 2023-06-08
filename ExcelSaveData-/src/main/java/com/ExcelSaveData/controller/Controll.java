package com.ExcelSaveData.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.ExcelSaveData.commonDto.Responce;
import com.ExcelSaveData.service.Service;

@RestController

public class Controll {

	@Autowired
	private Service service;

	@Bean
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ResponseEntity<Responce<?>> saveExcelData(@RequestParam("file") MultipartFile file) {

		Responce<?> responce = service.saveExcelDataToDatabase(file);

		return new ResponseEntity<Responce<?>>(responce, HttpStatus.OK);
	}
}
