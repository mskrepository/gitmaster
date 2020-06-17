package com.cg.org;
import java.util.Scanner;


public class DemoString {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		String str= "Hello World";
		String str1="Capgemini";
		
		int len;
		int len1;
		len=str.length();
		System.out.println("Length of string : "+len);
		
		System.out.println("String "+str+" is replaced with "+str.replace("Hello World", "Hello India"));
		//System.out.print(str.replace("Hello World", "Hello India"));
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String s = sc.nextLine();
		len1=s.length();
		System.out.println("No of characters in the accepted string are :"+len1);
		
		System.out.println(str1.substring(3));
		
		System.out.println("enter a string to reverse");
		String sr = sc.nextLine();
		StringBuffer sb =new StringBuffer(sr);
		System.out.println(sb.reverse());
		
		String str2="RamDevAnand";
		
		 System.out.println(str2.regionMatches(true, 11, str2, 0, 5));
		 
		 
		
	}

}
