package com.luv2code.AOPdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LuvAopExpressions {
	@Pointcut("execution(* com.luv2code.AOPdemo.dao.*.*(..))")
	public  void forDaoPackage(){}
	
	@Pointcut("execution(* com.luv2code.AOPdemo.dao.*.get*(..))")
	public void getter() {};
	
	@Pointcut("execution(* com.luv2code.AOPdemo.dao.*.set*(..))")
	public void setter() {};
	
	@Pointcut("forDaoPackage() && !(getter() || setter() )")
	public void forDaopackageNoGetterSetter() {}


}
