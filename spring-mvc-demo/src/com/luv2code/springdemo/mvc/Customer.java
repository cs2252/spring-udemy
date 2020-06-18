package com.luv2code.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Customer {
	
	String firstName;
	@NotNull(message="is required")
	@Size(min=1,message="is required")
	String lastName;
	
	@Min(value =0,message="freePass must be between 0 and 10")
	@Max(value =10,message="freePass must be between 0 and 10")
	@NotNull(message="is required")
	private Integer freePasses;
	
	@Pattern(message="only 5 character/digits", regexp = "^[a-zA-Z0-9]{5}")
	private String postalCode;

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

	public Integer getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	

}
