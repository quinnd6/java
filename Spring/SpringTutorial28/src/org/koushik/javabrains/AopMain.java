//Spring Tutorial 28 - Pointcuts and Wildcard Expressions 
package org.koushik.javabrains;

import org.koushik.javabrains.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopMain {
	
	public static void main(String[] args){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		ShapeService shapeService = ctx.getBean("shapeService",ShapeService.class);
		System.out.println(shapeService.getTriangle().getName());
		
	}

}
