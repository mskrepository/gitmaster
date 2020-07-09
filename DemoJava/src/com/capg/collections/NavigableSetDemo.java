package com.capg.collections;
import java.util.*;

public class NavigableSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NavigableSet set=new TreeSet();
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
        for(int i=0;i<str.length();i++)
        set.add(str.charAt(i));   
       
        System.out.println(set.descendingSet());
        
	
	}

}
