//Spring Tutorial 35 - Understanding AOP Proxies 
package org.koushik.javabrains;

import org.koushik.javabrains.service.FactoryService;
import org.koushik.javabrains.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopMain {
	
	public static void main(String[] args){
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		//ShapeService shapeService = ctx.getBean("shapeService",ShapeService.class);
		
		FactoryService factoryService = new FactoryService();
		ShapeService shapeService = (ShapeService)factoryService.getBean("shapeService");
		
		shapeService.getCircle();
		
		
	}

}
