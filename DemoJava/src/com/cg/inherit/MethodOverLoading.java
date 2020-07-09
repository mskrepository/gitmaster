package com.cg.inherit;

public class MethodOverLoading {

	
	
	public void add(int a,int b)
	{
	
		System.out.println(a+b);
	}
	public void add(int a,int b,int c) 
	{
		
		System.out.println(a+b+c);
	}
	
	public void add(float a,int b) 
	{
		System.out.println(a+b);
		
	}
	
	public void add(int a,float b)
	{
		System.out.println(a+b);
	}
	
	
	public void add(String a,String b)
	{
		
		System.out.println(a+b);
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverLoading mor=new MethodOverLoading();
		mor.add(1,2);
		mor.add(2,3,4);
		mor.add(2.2f,1);
		mor.add(2,1.2f);
		mor.add("first","second");
		
	}

}
