package com.luv2code.AOPdemo;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.AOPdemo.dao.AccountDAO;
import com.luv2code.AOPdemo.dao.MembershipDAO;
import com.luv2code.AOPdemo.service.TrafficFortuneService;

public class AroundDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(DemoConfig.class);

		TrafficFortuneService theFortuneService=context.getBean("trafficFortuneService",TrafficFortuneService.class);
		
		System.out.println("Main Program demo app!!");
		System.out.println("calling getFortune!!");
		
		String data=theFortuneService.getFortune();
		
		System.out.println("MyFourtune is: "+data);
		System.out.println("Finished");
		
		context.close();

	}

}
