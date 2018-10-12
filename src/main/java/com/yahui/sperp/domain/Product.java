package com.yahui.sperp.domain;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Product extends BasicDomain implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	private String code;
	private String name;
	
	

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	//TODO add more properties

	
}
