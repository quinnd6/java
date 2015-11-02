//Spring Tutorial 31 - After Advice Types 
package org.koushik.javabrains.model;

public class Circle {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("Circle's setter called");
		throw new RuntimeException();
	}
	
	public String setNameAndReturn(String name) {
		this.name = name;
		System.out.println("Circle's setter called");
		return name;
	}
}
