package com.capg.collections;
import java.util.*;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Employee[] emp=new Employee[5];
	    Set skillset=new HashSet();
		
	    skillset.add("Java");
	    skillset.add("Testing");
		skillset.add("DotNet");
		
	    emp[0]=new Employee(1001,"Rahul",20000.1f,skillset);
	    emp[1]=new Employee(1002,"Priyanka",10000.1f,skillset);
	    
	}

}
