package com.Collection.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CollectionMap")
public class CollectionMap {

	@Id
	@Column(name = "id")
	private long id;
	@Column(name = "name")
	private String name;
	@Column(name = "code")
	private String code;

	public long getId() {
		return id;
	}

	

	public String getName() {
		return name;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}
