//Hibernate Tutorial 12 - Proxy Objects and Eager and Lazy Fetch Types 
package org.koushik.hibernate;



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
		
		Address addr1 = new Address();
		addr1.setStreet("First Street");
		addr1.setCity("First City");
		addr1.setState("First State");
		addr1.setPincode("100001");
		
		Address addr2 = new Address();
		addr2.setStreet("Second Street");
		addr2.setCity("Second City");
		addr2.setState("Second State");
		addr2.setPincode("200002");
		
		user.getListOfAddresses().add(addr1);
		user.getListOfAddresses().add(addr2);
		
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
	    user = (UserDetails) session.get(UserDetails.class, 1);
	    session.close();
	    System.out.println(user.getListOfAddresses().size());
	  
	}

}
