//Spring tutorial 05
package org.koushik.javabrains;

public class Triangle {
	
	private String type;
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void draw(){
		System.out.println(getType() + " Triangle Drawn");
	}

}
