package com.wjl.maven.advice;

import org.aspectj.lang.ProceedingJoinPoint;

public class TotalAdvice {
	
	public void before(){
		System.out.println("---ǰ��֪ͨ---");
	}
	public void afterReturning(){
		System.out.println("===����֪ͨ===");
	}
	public void afterException(){
		System.out.println("~~~����֪ͨ~~~");
	}
	
	public Object around(ProceedingJoinPoint point)throws Throwable{
		System.out.println("++++�h�@֮ǰ");
		Object object = point.proceed();
		System.out.println("++++�h�@֮��");
		return object;
	}
	
	public void after(){
		System.out.println("++++++++++finally֪ͨ++++++++");
	}
}
