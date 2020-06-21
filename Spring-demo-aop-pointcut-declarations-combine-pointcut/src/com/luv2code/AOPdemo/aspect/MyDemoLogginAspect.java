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
	
	@Pointcut("execution(* com.luv2code.AOPdemo.dao.*.get*(..))")
	private void getter() {};
	
	@Pointcut("execution(* com.luv2code.AOPdemo.dao.*.set*(..))")
	private void setter() {};
	
	@Pointcut("forDaoPackage() && !(getter() || setter() )")
	private void forDaopackageNoGetterSetter() {}

	@Before("forDaopackageNoGetterSetter()")
	public void beforeAddAccountAdvice() {
		System.out.println("\n======>>> Executing before Advice on AddAccount()");
	}
	
	
	@Before("forDaopackageNoGetterSetter()")
	public void performApiAnalytics() {
		System.out.println("\n======>>> performing api analytis");
	}
	
}
