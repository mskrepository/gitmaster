package com.cg.org1;

public class StaticDemo {

	//instance variable
	private static int count;



	public StaticDemo() 
	{
		count=0;
	}


	public int getCount()
	{
		return ++count;
	}
}
