//Hibernate Tutorial 28 - Named Queries 
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
	   
	    Query query = session.getNamedQuery("UserDetails.byName");
	    query.setString(0, "User 1");
	  
	    List<UserDetails> users = (List<UserDetails>) query.list();
	    session.getTransaction().commit();
	    session.close();
	   
	    for(UserDetails u: users)
	    	System.out.println(u.getUserName());
	    
	    
	    
	}

}
