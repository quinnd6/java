//Spring Tutorial 29 - A Few More Pointcut Expressions
package org.koushik.javabrains.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	
	@Before("allGetters() && allCircleMethods()")
	public void LoggingAdvice(){
		System.out.println("Advice run. Get Method called");
	}
	
	@Before("allGetters()")
	public void secondAdvice(){
		System.out.println("Second Advice executed.");
	}
	
	@Pointcut("execution(* get*())")
	public void allGetters() {}
	
	@Pointcut("within(org.koushik.javabrains.model.Circle)")
	public void allCircleMethods() {}
}
