package com.capg.collections;
import java.util.*;

public class Employee {

	
	private int empid;
	private String name;
	private float basicsal;
	Set skillset;

	
	
	public Employee(int empid, String name, float basicsal, Set skillset) {
		super();
		this.empid = empid;
		this.name = name;
		this.basicsal = basicsal;
		this.skillset = skillset;
	}


//public static void main(String[] args) {
//	
//	Set skillset=new HashSet();
//	
//	skillset.add("Java");
//	skillset.add("Testing");
//	skillset.add("DotNet");
//	
//	System.out.println(skillset);
//}
}
