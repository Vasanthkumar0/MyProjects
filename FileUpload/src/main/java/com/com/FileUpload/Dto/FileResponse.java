package com.com.FileUpload.Dto;

public class FileResponse {

	private String name;
	  private String downloadUrl;
	  
	  public FileResponse(String name, String downloadUrl) {
	    this.name = name;
	    this.downloadUrl = downloadUrl;
	  }

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDownloadUrl() {
		return downloadUrl;
	}

	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}
	  
	  
}
