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
		user.setUserId(1);
		user.setUserName("First User");
		user.setAddress("First User's address");
		user.setJoinedDate(new Date());
		user.setDescription("Description of the user goes here");
		
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
	    
	    user = null;
	    
	    session = sessionFactory.openSession();
	    session.beginTransaction();
	    user = (UserDetails) session.get(UserDetails.class, 1);
	    System.out.println("User Name retrieved is " + user.getUserName());
	    
	    
	   
	    
	}

}
