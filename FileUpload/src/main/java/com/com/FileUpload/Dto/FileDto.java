package com.com.FileUpload.Dto;

import java.util.List;

public class FileDto {

	private long id;
	private String File;
	
	private List<ExcelDto> exceldata;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFile() {
		return File;
	}
	public void setFile(String file) {
		File = file;
	}
	
	
	public List<ExcelDto> getExceldata() {
		return exceldata;
	}
	public void setExceldata(List<ExcelDto> exceldata) {
		this.exceldata = exceldata;
	}
	
	
	
	
}
