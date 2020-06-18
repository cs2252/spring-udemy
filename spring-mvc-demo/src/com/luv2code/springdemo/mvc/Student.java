package com.luv2code.springdemo.mvc;

import java.util.LinkedHashSet;
import java.util.List;

public class Student {
	private String firstName;
	private String lastName;
	private String country;
	private String favoriteLanguage;
	private List<String> operatingSystems;
//	private LinkedHashSet<String> countryOptions;
	
	
	
	
	public Student() {
		System.out.println("default student constructor called");
//		countryOptions=new LinkedHashSet<String>();
//		countryOptions.add("Brazil");
//		countryOptions.add("INDIA");
//		countryOptions.add("America");
//		countryOptions.add("France");
		
		
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getFavoriteLanguage() {
		System.out.println("getFavoriteLanguage called");
		return favoriteLanguage;
	}
	public void setFavoriteLanguage(String favoriteLanguage) {
		System.out.println("setFavoriteLanguage called");
		this.favoriteLanguage = favoriteLanguage;
	}
	public List<String> getOperatingSystems() {
		return operatingSystems;
	}
	public void setOperatingSystems(List<String> operatingSystems) {
		this.operatingSystems = operatingSystems;
	}
	
	
//	public LinkedHashSet<String> getCountryOptions() {
//		return countryOptions;
//	}
//	
	

}
