package com.com.FileUpload.Controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.com.FileUpload.Dto.ExcelDto;
import com.com.FileUpload.Dto.FileDto;
import com.com.FileUpload.Service.FileService;


@RestController
public class FileControll {

	
		
	@Autowired
	private FileService fileService;
	
	@PostMapping("/upload")
	public ResponseEntity<?> uploadFile(@RequestParam("file") MultipartFile file) {
		ResponseEntity<?> response=fileService.savenew(file);
		return response;
	}
	  
	  
	@GetMapping("/Excel")
	public ResponseEntity<?> excelSave(@RequestBody FileDto FileDto) throws IOException {
		
		List<ExcelDto> dtos=FileDto.getExceldata();
		
		ResponseEntity<?> response=fileService.saveExcel(dtos);
		return response;
	}
	
	
	 
	
	@GetMapping("/files/{filename}")
	public ResponseEntity<?> downloadFile(@PathVariable("filename") String filename) {
		ResponseEntity<?> response= fileService.getdata(filename);
		return response;
	}
	
	/*
	 * @GetMapping("/createExcel") public ResponseEntity<byte[]> createExcelFile()
	 * throws IOException { // create an Excel workbook XSSFWorkbook workbook = new
	 * XSSFWorkbook();
	 * 
	 * // create an Excel sheet XSSFSheet sheet1= workbook.createSheet("Sheet1");
	 * XSSFSheet sheet2= workbook.createSheet("sheet2");
	 * 
	 * XSSFRow headerRow5 = sheet2.createRow(0);
	 * headerRow5.createCell(0).setCellValue("ID");
	 * headerRow5.createCell(1).setCellValue("Name");
	 * headerRow5.createCell(2).setCellValue("Age");
	 * 
	 * // create a header row XSSFRow headerRow = sheet1.createRow(0);
	 * headerRow.createCell(0).setCellValue("ID");
	 * headerRow.createCell(1).setCellValue("Name");
	 * headerRow.createCell(2).setCellValue("Age");
	 * 
	 * // create some data rows XSSFRow dataRow1 = sheet1.createRow(1);
	 * dataRow1.createCell(0).setCellValue(1);
	 * dataRow1.createCell(1).setCellValue("vasanth");
	 * dataRow1.createCell(2).setCellValue(30);
	 * 
	 * XSSFRow dataRow2 = sheet1.createRow(2);
	 * dataRow2.createCell(0).setCellValue(2);
	 * dataRow2.createCell(1).setCellValue("praveen");
	 * dataRow2.createCell(2).setCellValue(25);
	 * 
	 * XSSFRow dataRow3 = sheet1.createRow(3);
	 * dataRow3.createCell(0).setCellValue(21);
	 * dataRow3.createCell(1).setCellValue("surya");
	 * dataRow3.createCell(2).setCellValue(2523);
	 * 
	 * XSSFRow dataRow4 = sheet1.createRow(4);
	 * dataRow4.createCell(0).setCellValue(2121);
	 * dataRow4.createCell(1).setCellValue("aravidh");
	 * dataRow4.createCell(2).setCellValue(2523);
	 * 
	 * // write the Excel file to a byte array ByteArrayOutputStream baos = new
	 * ByteArrayOutputStream(); workbook.write(baos);
	 * 
	 * // return the byte array as a response with the appropriate headers
	 * HttpHeaders headers = new HttpHeaders();
	 * headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
	 * headers.setContentDispositionFormData("attachment", "Your Data.xlsx"); return
	 * new ResponseEntity<>(baos.toByteArray(), headers, HttpStatus.OK); }
	 */
}
