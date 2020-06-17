package com.cg.org;

public class Calculator {

	
	
	public Double add(double a,double b)
	{
		return a+b;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator calc=new Calculator();
		Double d=calc.add(3.156, 2.5221);
		System.out.println(d);

	}

}
