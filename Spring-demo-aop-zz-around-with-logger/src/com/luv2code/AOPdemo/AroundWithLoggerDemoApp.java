package com.luv2code.AOPdemo;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.AOPdemo.dao.AccountDAO;
import com.luv2code.AOPdemo.dao.MembershipDAO;
import com.luv2code.AOPdemo.service.TrafficFortuneService;

public class AroundWithLoggerDemoApp {

	private static Logger myLogger=Logger.getLogger(AroundWithLoggerDemoApp.class.getName());
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(DemoConfig.class);

		TrafficFortuneService theFortuneService=context.getBean("trafficFortuneService",TrafficFortuneService.class);
//		TrafficFortuneService theFortuneService=new TrafficFortuneService();
		myLogger.info("Main Program around Advice!!");
		myLogger.info("calling getFortune!!");
		
		String data=theFortuneService.getFortune();
		
		myLogger.info("MyFourtune is: "+data);
		myLogger.info("Finished");
		
		context.close(); 

	}

}
