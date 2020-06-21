package com.luv2code.AOPdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class MyDemoLogginAspect {
	
	
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
