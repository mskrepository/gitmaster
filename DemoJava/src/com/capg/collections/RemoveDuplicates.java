package com.capg.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Remove duplicates
		System.out.println("Remove Deuplicates");
		List<String> strList = new ArrayList<>(3);
		strList.add("capgemini");
		strList.add("capgemini");
		strList.add("capgemini");
		
		List<String> deDupStringList = new ArrayList<>(new HashSet<>(strList));
		
		System.out.println(deDupStringList);
		
/*
 * 
 * Set set=new LinkedHashSet();
        System.out.println("Enter a Strng value");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        for(int i=0;i<str.length();i++)
        set.add(str.charAt(i));   
       
        System.out.println(set.toString().replaceAll(",",""));
 * 
 * 
 */
	}

}
