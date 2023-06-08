package com.com.FileUpload.Service;

import java.io.IOException;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import com.com.FileUpload.Dto.ExcelDto;

public interface FileService {


	ResponseEntity<?> savenew(MultipartFile file);

	ResponseEntity<?> getdata(String filename);

	ResponseEntity<?> saveExcel(List<ExcelDto> excelDto) throws IOException;


	



}
