//Spring Tutorial 35 - Understanding AOP Proxies 
package org.koushik.javabrains.service;

import org.koushik.javabrains.aspect.Loggable;
import org.koushik.javabrains.model.Circle;
import org.koushik.javabrains.model.Triangle;

public class ShapeService {
	private Circle circle;
	private Triangle triangle;
	@Loggable
	public Circle getCircle() {
		System.out.println("Circle getter called");
		return circle;
	}
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	public Triangle getTriangle() {
		return triangle;
	}
	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}

}
