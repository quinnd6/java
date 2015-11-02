//Hibernate Tutorial 09 - AttributeOverrides and Embedded Object Keys 
package org.koushik.hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.koushik.javabrains.dto.Address;
import org.koushik.javabrains.dto.UserDetails;

public class HibernateTest {
	
	public static void main(String[] args){
		UserDetails user = new UserDetails();
		user.setUserName("First User");
		
		
		Address addr = new Address();
		addr.setStreet("Street Name");
		addr.setCity("City Name");
		
		user.setHomeAddress(addr);
		
		Address addr2 = new Address();
		addr2.setStreet("Second Street Name");
		addr2.setCity("Second City Name");
		
		user.setOfficeAddress(addr2);
		
		Configuration configuration = new Configuration();
	    configuration.configure();
	    ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(
	            configuration.getProperties()).build();
	    SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
	    Session session = sessionFactory.openSession();
	    session.beginTransaction();
	    session.save(user);
	    
	    session.getTransaction().commit();
	    session.close();
	  
	}

}
