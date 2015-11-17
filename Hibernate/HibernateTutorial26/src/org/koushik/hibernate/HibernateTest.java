//Hibernate Tutorial 26 - Select and Pagination in HQL 
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
	    
	    Query query = session.createQuery("select userName from UserDetails");
	    query.setFirstResult(5);
	    query.setMaxResults(4);
	    
	    List<String> userNames = (List<String>) query.list();
	    session.getTransaction().commit();
	    session.close();
	   
	    for(String u: userNames)
	    	System.out.println(u);
	    
	    
	    
	}

}
