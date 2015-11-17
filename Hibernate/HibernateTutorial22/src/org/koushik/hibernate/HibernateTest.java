//Hibernate Tutorial 22 - Transient, Persistent and Detached Objects
package org.koushik.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.koushik.javabrains.dto.UserDetails;


public class HibernateTest {
	
	public static void main(String[] args){
		
		UserDetails user = new UserDetails();
		user.setUserName("Test User");
		
		Configuration configuration = new Configuration();
	    configuration.configure();
	    ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(
	            configuration.getProperties()).build();
	    SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
	    Session session = sessionFactory.openSession();
	    session.beginTransaction();
	    
	    
	    
	    session.save(user);
	    
	    user.setUserName("Updated User");
	    user.setUserName("Updated User Again");
	    
	    session.getTransaction().commit();
	    session.close();
	    
	    user.setUserName("Updated User After Session Close");
	}

}
