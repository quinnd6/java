//Spring Tutorial 20 - Some JSR-250 Annotations 
package org.koushik.javabrains;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class Circle implements Shape{

	private Point center;
	
	public Point getCenter() {
		return center;
	}
	@Resource
	public void setCenter(Point center) {
		this.center = center;
	}
	
	@PostConstruct
	public void initializeCircle() {
		System.out.println("Init of Circle");
	}
	
	@PreDestroy
	public void destroyCircle() {
		System.out.println("Destroy of Circle");
	}
	

	@Override
	public void draw() {
		
		System.out.println("Drawing Circle");
		System.out.println("Circle: Point is: (" + center.getX() + ", " + center.getY() + ")");
	}

}
