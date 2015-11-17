//Spring Tutorial 21 - Component and Stereotype Annotations 
package org.koushik.javabrains;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Controller
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
