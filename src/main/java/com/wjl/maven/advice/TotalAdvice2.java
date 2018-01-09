package com.wjl.maven.advice;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TotalAdvice2 {

	@Pointcut("execution(* com.wjl.maven.service.impl.*.*(..))")
	public void pc(){}
	
	@AfterReturning("TotalAdvice2.pc()")
	public void afterReturning(){
		System.out.println("_________··÷√Õ®÷™");
	}
}
