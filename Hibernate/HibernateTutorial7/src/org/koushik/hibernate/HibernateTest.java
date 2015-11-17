//Hibernate Tutorial 07 - Primary Keys 
package org.koushik.hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.koushik.javabrains.dto.UserDetails;

public class HibernateTest {
	
	public static void main(String[] args){
		UserDetails user = new UserDetails();
		user.setUserName("First User");
		
		UserDetails user2 = new UserDetails();
		user2.setUserName("Second User");
		
		Configuration configuration = new Configuration();
	    configuration.configure();
	    ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(
	            configuration.getProperties()).build();
	    SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
	    Session session = sessionFactory.openSession();
	    session.beginTransaction();
	    session.save(user);
	    session.save(user2);
	    session.getTransaction().commit();
	    session.close();
	  
	}

}
