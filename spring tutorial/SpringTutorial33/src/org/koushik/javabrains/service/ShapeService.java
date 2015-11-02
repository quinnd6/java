//Spring Tutorial 33 - Naming Conventions and Custom Advice Annotations 
package org.koushik.javabrains.service;

import org.koushik.javabrains.aspect.Loggable;
import org.koushik.javabrains.model.Circle;
import org.koushik.javabrains.model.Triangle;

public class ShapeService {
	private Circle circle;
	private Triangle triangle;
	@Loggable
	public Circle getCircle() {
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
