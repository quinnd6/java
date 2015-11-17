//Spring Tutorial 30 - JoinPoints and Advice Arguments
package org.koushik.javabrains.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	
	@Before("allCircleMethods()")
	public void LoggingAdvice(JoinPoint joinPoint){
		
	}
	
	@Before("args(name)")
	public void stringArgumentMethods(String name){
		System.out.println("A method that takes String arguments has been called. The value is "+name);
	}
	
	@Pointcut("execution(* get*())")
	public void allGetters() {}
	
	@Pointcut("within(org.koushik.javabrains.model.Circle)")
	public void allCircleMethods() {}
}
