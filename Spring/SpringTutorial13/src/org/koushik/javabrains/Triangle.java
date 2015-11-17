//Spring Tutorial 13 - Bean Definition Inheritance 
package org.koushik.javabrains;

import java.util.List;

public class Triangle {
	
	private List<Point> points;
	
	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}

	/*
	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
*/
	public void draw(){
		
		for(Point point : points)
		{
			System.out.println("Point = (" +point.getX() +", "+ point.getY()+")" );
		}
		/*
		System.out.println("Point A = (" +getPointA().getX() +", "+ getPointA().getY()+")" );
		System.out.println("Point B = ("+getPointB().getX()+","+ getPointB().getY()+")");
		System.out.println("Point C = ("+getPointC().getX()+","+ getPointC().getY()+")");
		*/
	}

}
