package com.cg.inherit;
//import java.util.Scanner;

public class Rectangle extends Shape implements Printer{
	
float l=10;
float b=5;
//float w=15;
//float perimeter=0;	
	
	public void calArea() {
		
		area=l*b;
		System.out.println("Area of Rectangle: "+area);
		
	}
	
	public void perimeter()
	{
		//perimeter=2(l+w);
		perimeter= 2*(l+b);
		System.out.println("Perimeter of Rectangle : "+perimeter);
	}
	
	public void print()
	{
		
		System.out.println("print method called");
	}
	
	public void scan()
	{
		
		System.out.println("scan method called");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle rct=new Rectangle();
		rct.calArea();
		rct.perimeter();
		rct.print();
		rct.scan();

	}

}
