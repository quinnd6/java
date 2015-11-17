//Spring Tutorial 40 - Returning Other Datatypes from JdbcTemplate  and
//Spring Tutorial 41 - Implementing RowMapper 
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
		System.out.println(dao.getAllCircles().size());
	}

}
