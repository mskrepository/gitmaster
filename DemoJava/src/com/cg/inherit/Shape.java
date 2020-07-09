package com.cg.inherit;

public abstract class Shape {
	
	float area, perimeter;
	
	public abstract void calArea();
	public abstract void perimeter();
	
	public void display()
	{		
		System.out.println("Area :"+area);
		System.out.println("Perimeter :"+perimeter);
		
	}
	
	

}
