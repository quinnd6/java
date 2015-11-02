//Hibernate Tutorial 27 - Understanding Parameter Binding and SQL Injection 
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
	    String minUserId = "5";
	    String userName = "User 10";
	    Query query = session.createQuery("from UserDetails where userId > :userId and userName = :userName" );
	    query.setInteger("userId", Integer.parseInt(minUserId));
	    query.setString("userName", userName);
	   
	    List<UserDetails> users = (List<UserDetails>) query.list();
	    session.getTransaction().commit();
	    session.close();
	   
	    for(UserDetails u: users)
	    	System.out.println(u.getUserName());
	    
	    
	    
	}

}
