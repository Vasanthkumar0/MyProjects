package com.Collection.Dto;

import java.util.List;
import java.util.Map;

public class ResponseDto<T> {

	private String response;

	//private Map<?, ?> map;

	private List<?> ResponseList;

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public List<?> getResponseList() {
		return ResponseList;
	}

	public void setResponseList(List<?> responseList) {
		ResponseList = responseList;
	}

//	public Map<?, ?> getMap() {
//		return map;
//	}
//
//	public void setMap(Map<?, ?> map) {
//		this.map = map;
//	}

}
