//Hibernate Tutorial 34 - Using Query Cache 
package org.koushik.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
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
	   
	    Query query = session.createQuery("from UserDetails user where user.userId = 1");
	    query.setCacheable(true);
	    List users = query.list();
	    
	    
	   
	    
	    session.getTransaction().commit();
	    session.close();
	   
	    Session session2 = sessionFactory.openSession();
	    session2.beginTransaction();
	 
	    Query query2 = session2.createQuery("from UserDetails user where user.userId = 1");
	    query2.setCacheable(true);
	    users = query2.list();
	    
	    session2.getTransaction().commit();
	    session2.close();
	   
	  
	    
	    
	}

}
