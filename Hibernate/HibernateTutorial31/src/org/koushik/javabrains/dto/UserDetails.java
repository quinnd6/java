//Hibernate Tutorial 31 - Projections and Query By Example
package org.koushik.javabrains.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;


import org.hibernate.annotations.SelectBeforeUpdate;

@Entity
@NamedQuery(name="UserDetails.byId", query="from UserDetails where userId = ?")
@SelectBeforeUpdate
public class UserDetails {
	@Id @GeneratedValue (strategy=GenerationType.AUTO)
	private int userId;
	private String userName;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	
}
