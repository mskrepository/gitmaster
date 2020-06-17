package com.capg.collections;
import java.util.*;

import com.capg.exceptions.Employee;


public class RemoveElement {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ArrayList al=new ArrayList();
		ArrayList<Integer> alist=new ArrayList<Integer>(); 
	      alist.add(1);
	      alist.add(2);
	      alist.add(3);
	      alist.add(4);
	      alist.add(5);
	      alist.add(6);
System.out.println("Elements in the alist are : "+alist);

alist.remove(2);
alist.remove(4);
System.out.println("Element removed from the alist : "+alist);



	}

}
