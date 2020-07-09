package com.cg.org;

public class StaticTest {

	
	static
	{
		//for initialization of database configuration parameters
		//for loading images
		System.out.println("Inside static block-1");
	}
	
	
	static
	{
		System.out.println("Inside static block-2");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("From main()");
	}

}
