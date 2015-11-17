//Spring Tutorial 42 - Performing Write Operations with JdbcTemplate
package org.koushik.javabrains;

import org.koushik.javabrains.dao.JdbcDaoImpl;
import org.koushik.javabrains.model.Circle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcDemo {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		JdbcDaoImpl dao = ctx.getBean("jdbcDaoImpl", JdbcDaoImpl.class);
		
		//Circle circle = dao.getCircle(1);
		//System.out.println(circle.getName());
		//System.out.println(dao.getCircleForId(1).getName());
//		dao.insertCircle(new Circle(3,"Third Circle"));
//		System.out.println(dao.getAllCircles().size());
		dao.createTriangleTable();
	}

}
