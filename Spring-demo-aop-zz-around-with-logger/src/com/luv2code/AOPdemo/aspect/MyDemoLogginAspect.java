package com.luv2code.AOPdemo.aspect;

import java.io.ObjectInputStream.GetField;
import java.util.List;
import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.luv2code.AOPdemo.Account;
import com.luv2code.AOPdemo.AroundWithLoggerDemoApp;

@Aspect
@Component
@Order(2)
public class MyDemoLogginAspect {
	
	private static Logger myLogger=Logger.getLogger(AroundWithLoggerDemoApp.class.getName());

	
	@Around("execution(* com.luv2code.AOPdemo.service.TrafficFortuneService.getFortune(..))")
	public Object aroundGetFortune(
			ProceedingJoinPoint theProcedingJoinPoint) throws Throwable{
		
		String method=theProcedingJoinPoint.getSignature().toShortString();
		myLogger.info("\n========>>> executing around advice on method: "+method);
		
		long begin=System.currentTimeMillis();
		
		Object result=theProcedingJoinPoint.proceed();
		
		long end=System.currentTimeMillis();
		
		long duration=end-begin;
		
		myLogger.info("\n========>>> Duration : "+duration+ " seconds");
		
		
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	@After("execution(* com.luv2code.AOPdemo.dao.AccountDAO.findAccounts(..))")
	public void afterFinallyFindAccountsAdvice(JoinPoint theJoinPoint) {
		
		String method=theJoinPoint.getSignature().toShortString();
		myLogger.info("\n========>>> executing after(finally) on method: "+method);
		
	}
	
	
	
	
	@AfterThrowing(
			pointcut="execution(* com.luv2code.AOPdemo.dao.AccountDAO.findAccounts(..))",
			throwing="theExe"
			)
	public void afterThrowingFindAccountsAdvice(JoinPoint theJoinPoint, Throwable theExe) {
		
		String method=theJoinPoint.getSignature().toShortString();
		myLogger.info("\n========>>> executing afterThrowing on method: "+method);
		
		myLogger.info("\n=======>> Exception is: "+theExe);
	}
	
	
	
	
	//add a new advice @AfterReturing on the find accounts method
	@AfterReturning(pointcut="execution(* com.luv2code.AOPdemo.dao.AccountDAO.findAccounts(..))",returning="result")
	public void afterReturningFindAccountsAdvice(JoinPoint theJoinPoint,
			List<Account> result) {
		
		//print out which method we are advising on
		String method=theJoinPoint.getSignature().toShortString();
		myLogger.info("\n========>>> executing afterReturning on method: "+method);
		
		//modify the result
		convertAccountNamestoUpperCase(result);
		
		
		
		//print the result of the method call	
		myLogger.info("\n=======>> result is: "+result);
		
	}
	
	
	
	
	
	
	
	
	private void convertAccountNamestoUpperCase(List<Account> result) {
		for(Account ac:result)
		{
			ac.setName(ac.getName().toUpperCase());
			ac.setLevel(ac.getLevel().toUpperCase());
		}
		
	}








	@Before("com.luv2code.AOPdemo.aspect.LuvAopExpressions.forDaopackageNoGetterSetter()")
	public void beforeAddAccountAdvice(JoinPoint theJoinPoint) {
		myLogger.info("\n======>>> Executing before Advice on AddAccount()");
		
		MethodSignature methodsig=(MethodSignature)theJoinPoint.getSignature();
		
		myLogger.info("Method : "+ methodsig);
		
		Object[] args=theJoinPoint.getArgs();
		for(Object arg:args)
		{
			myLogger.info(arg.toString());
		}
	}

	
}
