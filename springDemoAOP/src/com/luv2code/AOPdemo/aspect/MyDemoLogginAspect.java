package com.luv2code.AOPdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLogginAspect {

	@Before("execution(public void add*())")
	public void beforeAddAccountAdvice() {
		System.out.println("\n======>>> Executing before Advice on AddAccount()");
	}
	
}
