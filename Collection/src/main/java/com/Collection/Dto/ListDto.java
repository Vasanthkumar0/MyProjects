package com.Collection.Dto;

public class ListDto {

	private long id;
	private String name;
	private String value;

	// private LinkedList<CommonDto<?> >commonDto;
	// private LinkedList<ListDto> listDto;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
//	public LinkedList<ListDto> getListDto() {
//		return listDto;
//	}
//	public void setListDto(LinkedList<ListDto> listDto) {
//		this.listDto = listDto;
//	}
//	public LinkedList<CommonDto<?> > getCommonDto() {
//		return commonDto;
//	}
//	public void setCommonDto(LinkedList<CommonDto<?> > commonDto) {
//		this.commonDto = commonDto;
//	}

}
