//Hibernate Tutorial 31 - Projections and Query By Example 
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
	   
	    UserDetails exampleUser = new UserDetails();
	    //exampleUser.setUserId(5);
	    exampleUser.setUserName("User 1%");
	    
	    Example example = Example.create(exampleUser).enableLike();
	    
	    Criteria criteria = session.createCriteria(UserDetails.class)
	    					.add(example);
	   
	  
	    List<UserDetails> users = (List<UserDetails>) criteria.list();
	    
	    session.getTransaction().commit();
	    session.close();
	   
	    for(UserDetails u: users)
	    	System.out.println(u.getUserName());
	  
	    
	    
	}

}
