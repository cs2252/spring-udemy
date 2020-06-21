package com.luv2code.AOPdemo;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.AOPdemo.dao.AccountDAO;
import com.luv2code.AOPdemo.dao.MembershipDAO;

public class AfterReturningDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(DemoConfig.class);
		AccountDAO theAccountDAO=context.getBean("accountDAO",AccountDAO.class);
		
		//call the methods to finds accounts
		List<Account> theAccounts=theAccountDAO.findAccounts();
		
		//display the accounts
		System.out.println("\n\n Main program: AfterReturningDemoApp");
		System.out.println(theAccounts);
		System.out.println("\n");
	
		
		context.close();

	}

}
