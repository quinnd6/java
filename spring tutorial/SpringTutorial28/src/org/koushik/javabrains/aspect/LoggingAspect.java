//Spring Tutorial 28 - Pointcuts and Wildcard Expressions 
package org.koushik.javabrains.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	
	@Before("allGetters()")
	public void LoggingAdvice(){
		System.out.println("Advice run. Get Method called");
	}
	
	@Before("allGetters()")
	public void secondAdvice(){
		System.out.println("Second Advice executed.");
	}
	
	@Pointcut("execution(* get*())")
	public void allGetters() {}
}
