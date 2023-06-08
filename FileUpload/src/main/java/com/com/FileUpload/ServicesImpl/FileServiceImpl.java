package com.com.FileUpload.ServicesImpl;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.com.FileUpload.Dto.ExcelDto;
import com.com.FileUpload.Service.FileService;

@Service
public class FileServiceImpl implements FileService {

//	private final XSSFWorkbook workbook = new XSSFWorkbook();
//	private final XSSFSheet sheet = workbook.createSheet("Sheet1");
//	private int rowCount = 0;

	@Override
	public ResponseEntity<?> savenew(MultipartFile file) {
		String uploadDir = "/home/fasoftwares/Documents/fa";

		String fileName = StringUtils.cleanPath(file.getOriginalFilename());
		Path filePath = Paths.get(uploadDir, fileName);
		try {
			Files.createDirectories(filePath.getParent());
//			System.err.println("getParent : " + filePath.getParent());
//			System.err.println("getFileName : " + filePath.getFileName());
//			System.err.println("toAbsolutePath :" + filePath.toAbsolutePath());
			Files.createFile(filePath);
			try (OutputStream os = Files.newOutputStream(filePath)) {
				os.write(file.getBytes());
			}
			return ResponseEntity.ok().body("File uploaded successfully");
		} catch (IOException e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("please upload file");
		}
	}

	@Override
	public ResponseEntity<?> getdata(String filename) {
		String directory = "/home/fasoftwares/Documents/fa";
		File file = new File(directory, filename);
		try {
			Resource resource = new UrlResource(file.toURI());
			if (resource.exists() || resource.isReadable()) {
				return ResponseEntity.ok().contentType(MediaType.APPLICATION_OCTET_STREAM)
						.header(HttpHeaders.CONTENT_DISPOSITION,
								"attachment; filename=\"" + resource.getFilename() + "\"")
						.body(resource);
			} else {
				return ResponseEntity.status(HttpStatus.NOT_FOUND)
						.body("File Not Found or Plaese Enter Correct File Name");
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
		}
	}

	@SuppressWarnings("resource")
	@Override
	public ResponseEntity<?> saveExcel(List<ExcelDto> excelDto) {

		int rowCount = 1;
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Sheet1");
		try {
			XSSFRow headerRow = sheet.createRow(0);
			headerRow.createCell(0).setCellValue("ID");
			headerRow.createCell(1).setCellValue("Name");
			headerRow.createCell(2).setCellValue("Age");

			for (ExcelDto dto : excelDto) {
				XSSFRow excelRow = sheet.createRow(rowCount++);
				excelRow.createCell(0).setCellValue(dto.getId());
				excelRow.createCell(1).setCellValue(dto.getName());
				excelRow.createCell(2).setCellValue(dto.getAge());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		ByteArrayOutputStream baos = new ByteArrayOutputStream();

		try {
			workbook.write(baos);
		} catch (IOException e) {
			e.printStackTrace();
		}

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
		headers.setContentDispositionFormData("attachment", "Your Data.xlsx");
		return new ResponseEntity<>(baos.toByteArray(), headers, HttpStatus.OK);

	}

}
