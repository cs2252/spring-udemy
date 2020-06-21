package com.luv2code.AOPdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {
	
	private String name;
	private String serviceCode;

	public void addAccount() {
		System.out.println(getClass()+": Doing my db work: Adding account");
	}

	public String getName() {
		
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getServiceCode() {
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}
	
}
