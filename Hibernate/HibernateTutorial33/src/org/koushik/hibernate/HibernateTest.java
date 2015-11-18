//Hibernate Tutorial 33 - Configuring Second Level Cache
package org.koushik.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.service.ServiceRegistry;
import org.koushik.javabrains.dto.UserDetails;


public class HibernateTest {
	
	public static void main(String[] args){
		
		Configuration configuration = new Configuration();
	    configuration.configure();
	    ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(
	            configuration.getProperties()).build();
	    SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
	    Session session = sessionFactory.openSession();
	    session.beginTransaction();
	   
	    UserDetails user = (UserDetails) session.get(UserDetails.class, 1);
	    user.setUserName("Updated User");
	    
	   
	    
	    session.getTransaction().commit();
	    session.close();
	   
	    Session session2 = sessionFactory.openSession();
	    session2.beginTransaction();
	 
	    UserDetails user2 = (UserDetails) session2.get(UserDetails.class, 1);
	    
	    session2.getTransaction().commit();
	    session2.close();
	   
	  
	    
	    
	}

}
