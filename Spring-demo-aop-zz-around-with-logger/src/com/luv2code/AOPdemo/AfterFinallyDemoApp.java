package com.luv2code.AOPdemo;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.AOPdemo.dao.AccountDAO;
import com.luv2code.AOPdemo.dao.MembershipDAO;

public class AfterFinallyDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(DemoConfig.class);
		AccountDAO theAccountDAO=context.getBean("accountDAO",AccountDAO.class);
		
		//call the methods to finds accounts
		List<Account> theAccounts=null;
		try {
		//add a boolean flag to simulate 
		boolean tripWire=false;
		theAccountDAO.findAccounts(tripWire);
		}catch(Exception ex)
		{
			System.out.println("\n\nMain program caught exception.."+ex);
		}
		
		//display the accounts
		System.out.println("\n\n Main program: AfterThrowingDemoApp");
		System.out.println(theAccounts);
		System.out.println("\n");
	
		
		context.close();

	}

}
