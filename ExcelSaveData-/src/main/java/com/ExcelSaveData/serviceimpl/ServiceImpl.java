package com.ExcelSaveData.serviceimpl;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

import com.ExcelSaveData.commonDto.Responce;
import com.ExcelSaveData.entity.ExcelEntity;
import com.ExcelSaveData.repository.ExcelRepository;
import com.ExcelSaveData.service.Service;


/**@author vasanthakumar */
@org.springframework.stereotype.Service
public class ServiceImpl implements Service {

	@Autowired
	private static final Logger logger = LoggerFactory.getLogger(ServiceImpl.class);


	@Autowired
	private ExcelRepository excelRepositry;

	@SuppressWarnings("null")
	@Override
	public Responce<?> saveExcelDataToDatabase(MultipartFile file) {
		Responce<String> response = new Responce<>();

		try {

			if (!file.getOriginalFilename().endsWith(".xlsx")) {
				response.setResponse("Only Excel files (.xlsx) are allowed.");
				return response;
			}

			// Read the Excel file
			Workbook workbook = new XSSFWorkbook(file.getInputStream());
			Sheet sheet = workbook.getSheetAt(0); // Assuming data is in the first sheet

			// Check if column names match the database column names
			Row headerRow = sheet.getRow(0);
			if (!checkColumnNames(headerRow)) {
				response.setResponse("Column names in the Excel file do not match the expected database column names.");
				return response;
			}
			// Iterate over rows and save data to the database
			for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
				Row row = sheet.getRow(rowNum);

				// Create an instance of your entity class
				ExcelEntity entity = new ExcelEntity();

				// Set the values from the Excel cells to the entity properties
				entity.setId((long) row.getCell(0).getNumericCellValue());

				entity.setName(row.getCell(1).getStringCellValue());

				entity.setAge((int) row.getCell(2).getNumericCellValue());

				entity.setState(row.getCell(3).getStringCellValue());

				entity.setPinCode((long) row.getCell(4).getNumericCellValue());

				excelRepositry.save(entity);

			}
			workbook.close();
			response.setResponse("Excel data saved successfully.");
			logger.info("Excel data saved successfully.");
		} catch (IOException e) {
			e.printStackTrace();
			response.setResponse("Failed to save Excel data.");
			logger.error("Failed to save Excel data", e);

		}

		return response;

	}

	// Check if column names match the database column names
	private boolean checkColumnNames(Row headerRow) {
		try {
			// Define database column names
			String[] expectedColumnNames = { "id", "name", "age", "state", "pincode" };
			for (int i = 0; i < expectedColumnNames.length; i++) {
				Cell cell = headerRow.getCell(i);
				String columnName = cell.getStringCellValue();

				if (!columnName.equalsIgnoreCase(expectedColumnNames[i])) {
					return false;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
			logger.error("Column names in the Excel file do not match the expected database column names.", e);
			return false;
		}

		return true;
	}

}