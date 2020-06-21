package com.luv2code.AOPdemo.service;

import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Component;
@Component
public class TrafficFortuneService {
	
	public String getFortune() {
		
		//simulate a delay
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//return a fortuen
		return "Expect heavy traffic this mornging";
	}

	public String getFortune(boolean tripWire) {
		
		if(tripWire)
		{
			throw new RuntimeException("Major Accident! Highway is closed");
		}
		return getFortune();
		
	}

}
