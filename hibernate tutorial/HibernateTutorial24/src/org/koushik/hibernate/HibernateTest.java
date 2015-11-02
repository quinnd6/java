//Hibernate Tutorial 24 - Persisting Detached Objects 
package org.koushik.hibernate;

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
	    
	    UserDetails user = (UserDetails)session.get(UserDetails.class, 1);
	    
	    session.getTransaction().commit();
	    session.close();
	    
	    user.setUserName("Changed name");

	    session = sessionFactory.openSession();
	    session.beginTransaction();
	    session.update(user);
	    
	    session.getTransaction().commit();
	    session.close();
	}

}
