package com.wjl.maven.advice;

import org.aspectj.lang.ProceedingJoinPoint;

public class TotalAdvice {
	
	public void before(){
		System.out.println("---前置通知---");
	}
	public void afterReturning(){
		System.out.println("===後置通知===");
	}
	public void afterException(){
		System.out.println("~~~異常通知~~~");
	}
	
	public Object around(ProceedingJoinPoint point)throws Throwable{
		System.out.println("++++環繞之前");
		Object object = point.proceed();
		System.out.println("++++環繞之後");
		return object;
	}
	
	public void after(){
		System.out.println("++++++++++finally通知++++++++");
	}
}
