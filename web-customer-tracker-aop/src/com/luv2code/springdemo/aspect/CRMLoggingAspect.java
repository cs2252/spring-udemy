package com.luv2code.springdemo.aspect;

import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CRMLoggingAspect {
	
	//setup private logger
	private Logger myLogger=Logger.getLogger(getClass().getName());
	
	//setup pointcut declaration
	@Pointcut("execution(* com.luv2code.springdemo.controller.*.*(..))")
	private void forControllerPackage() {
		
	}
	@Pointcut("execution(* com.luv2code.springdemo.service.*.*(..))")
	private void forServicePackage() {
		
	}
	@Pointcut("execution(* com.luv2code.springdemo.dao.*.*(..))")
	private void forDaoPackage() {
		
	}
	
	@Pointcut("forControllerPackage() || forServicePackage() || forDaoPackage()")
	private void forAppFlow() {
		
	}
	
	//add @before advice
	@Before("forAppFlow()")
	public void Before(JoinPoint theJoinPoint)
	{
		String theMethod= theJoinPoint.getSignature().toShortString();
		myLogger.info("=========>>>> in @Before : calling method : "+ theMethod);
		
		Object[] objs=theJoinPoint.getArgs();
		if(objs.length==0)
			myLogger.info("=========>>>>no arguments");
		for(Object obj:objs)
		{
			myLogger.info("======>>>> argument: "+obj);
		}
	}
	
	
	
	//add @afterreturning advice
	@AfterReturning(
			pointcut="forAppFlow()",
			returning="theResult"
			)
	public void afterReturning(JoinPoint theJoinPoint, Object theResult) {
		
		String theMethod= theJoinPoint.getSignature().toShortString();
		myLogger.info("=========>>>> in @AfterReturning : calling method : "+ theMethod);
		myLogger.info("========>>>>: result : "+theResult);
	}

}
