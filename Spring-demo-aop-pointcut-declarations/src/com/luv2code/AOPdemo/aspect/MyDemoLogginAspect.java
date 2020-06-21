package com.luv2code.AOPdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLogginAspect {
	
	@Pointcut("execution(* com.luv2code.AOPdemo.dao.*.*(..))")
	private  void forDaoPackage(){}

	@Before("forDaoPackage()")
	public void beforeAddAccountAdvice() {
		System.out.println("\n======>>> Executing before Advice on AddAccount()");
	}
	
}
