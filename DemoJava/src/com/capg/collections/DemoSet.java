package com.capg.collections;
import java.util.*;


public class DemoSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//unordered
		//heterogogenous
		//unique
		//Set set=new HashSet();
		Set set=new TreeSet();
		 System.out.println("Enter a Strng value");
	        Scanner sc=new Scanner(System.in);
	        String str=sc.next();
	        for(int i=0;i<str.length();i++)
	        set.add(str.charAt(i));   
	       
	        System.out.println(set.toString().replaceAll(",",""));
		
//		set.add("Hello");
//		set.add(1);
//		set.add(1.1);
//		set.add('a');
//		set.add(true);
//		set.add(1);
//		set.add(1);
//		
//		System.out.println(set);
//		
		
		//Remove duplicates
//		System.out.println("Remove Deuplicates");
//		List<String> strList = new ArrayList<>(3);
//		strList.add("1");
//		strList.add("1");
//		strList.add("1");
//		
//		List<String> deDupStringList = new ArrayList<>(new HashSet<>(strList));
//		
//		System.out.println(deDupStringList);
//		
	}

}
