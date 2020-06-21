package com.luv2code.AOPdemo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.luv2code.AOPdemo.Account;

@Component
public class AccountDAO {
	
	private String name;
	private String serviceCode;
	
	public List<Account> findAccounts(){
		List<Account> myAccounts=new ArrayList<Account>();
		
		//create some sample accounts and them to the list
		Account temp1=new Account("jhon","gold");
		Account temp2 = new Account("doe","silver");
		Account temp3 = new Account("lucka","platinum");
		
		myAccounts.add(temp1);
		myAccounts.add(temp2);
		myAccounts.add(temp1);	
		return myAccounts;
	}
	
	
	

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
