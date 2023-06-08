package com.ExcelSaveData.service;

import org.springframework.web.multipart.MultipartFile;

import com.ExcelSaveData.commonDto.Responce;

public interface Service {

	Responce<?> saveExcelDataToDatabase(MultipartFile file);

}
