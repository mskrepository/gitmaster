package com.cg.inherit;
//created by Sarfaraz Khan

public class Square extends Shape{

	float l=10;
	
	
	public void calArea() {
		
		area=l*l;
		System.out.println("Area of square: "+area);
		
	}
	
	public void perimeter()
	{
		perimeter=4*l;
		System.out.println("Perimeter of square : "+perimeter);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Square sqr=new Square();
		sqr.calArea();
		sqr.perimeter();
		

	}

}
