package report;
import java.text.DateFormat;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class LoggingAspect {    
    // pointcut expression says that apply log advice to a generateReport() method 
    // which can take any number of arguments and can return any value, belongs to ReportService class from the package com.infosys.demo 
    @AfterReturning("execution(* report.ReportService.generateReport(..))")  
    public void logAfterAdvice(JoinPoint joinPoint){            
          //Log Joinpoint signature details          
          System.out.println("Joinpoint signature :" + joinPoint.getSignature());
          long time = System.currentTimeMillis();               
          //Log details such as time stamp of report generated
          System.out.println("Report generated at time:" + DateFormat.getDateTimeInstance().format(time));
   }            
}