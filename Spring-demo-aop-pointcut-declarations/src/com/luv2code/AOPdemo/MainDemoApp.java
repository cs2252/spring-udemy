package com.luv2code.AOPdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.AOPdemo.dao.AccountDAO;
import com.luv2code.AOPdemo.dao.MembershipDAO;

public class MainDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(DemoConfig.class);
		AccountDAO theAccountDAO=context.getBean("accountDAO",AccountDAO.class);
		theAccountDAO.addAccount();
//		theAccountDAO.addAccount();
		
		MembershipDAO theMembershipDAO= context.getBean("membershipDAO",MembershipDAO.class);
		theMembershipDAO.addAccount();
		context.close();

	}

}
