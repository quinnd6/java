//Spring Tutorial 45 - Using Hibernate with Spring
package org.koushik.javabrains;

import org.koushik.javabrains.dao.HibernateDaoImpl;
import org.koushik.javabrains.dao.JdbcDaoImpl;
import org.koushik.javabrains.dao.NamedParameterJdbcDaoImpl;
import org.koushik.javabrains.model.Circle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcDemo {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		HibernateDaoImpl dao = ctx.getBean("hibernateDaoImpl", HibernateDaoImpl.class);
    	System.out.println(dao.getCircleCount());
		
	}

}
