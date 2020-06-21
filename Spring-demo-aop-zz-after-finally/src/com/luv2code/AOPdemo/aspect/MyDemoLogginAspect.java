package com.luv2code.AOPdemo.aspect;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.luv2code.AOPdemo.Account;

@Aspect
@Component
@Order(2)
public class MyDemoLogginAspect {
	
	
	@After("execution(* com.luv2code.AOPdemo.dao.AccountDAO.findAccounts(..))")
	public void afterFinallyFindAccountsAdvice(JoinPoint theJoinPoint) {
		
		String method=theJoinPoint.getSignature().toShortString();
		System.out.println("\n========>>> executing after(finally) on method: "+method);
		
	}
	
	
	
	
	@AfterThrowing(
			pointcut="execution(* com.luv2code.AOPdemo.dao.AccountDAO.findAccounts(..))",
			throwing="theExe"
			)
	public void afterThrowingFindAccountsAdvice(JoinPoint theJoinPoint, Throwable theExe) {
		
		String method=theJoinPoint.getSignature().toShortString();
		System.out.println("\n========>>> executing afterThrowing on method: "+method);
		
		System.out.println("\n=======>> Exception is: "+theExe);
	}
	
	
	
	
	//add a new advice @AfterReturing on the find accounts method
	@AfterReturning(pointcut="execution(* com.luv2code.AOPdemo.dao.AccountDAO.findAccounts(..))",returning="result")
	public void afterReturningFindAccountsAdvice(JoinPoint theJoinPoint,
			List<Account> result) {
		
		//print out which method we are advising on
		String method=theJoinPoint.getSignature().toShortString();
		System.out.println("\n========>>> executing afterReturning on method: "+method);
		
		//modify the result
		convertAccountNamestoUpperCase(result);
		
		
		
		//print the result of the method call	
		System.out.println("\n=======>> result is: "+result);
		
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
		System.out.println("\n======>>> Executing before Advice on AddAccount()");
		
		MethodSignature methodsig=(MethodSignature)theJoinPoint.getSignature();
		
		System.out.println("Method : "+ methodsig);
		
		Object[] args=theJoinPoint.getArgs();
		for(Object arg:args)
		{
			System.out.println(arg);
		}
	}

	
}
