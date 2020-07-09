package com.capg.collections;
import java.util.*;

public class DemoList {


	public static void main(String[] args) {
		
		List ls=new ArrayList();
		ls.add(10);
		ls.add(1.1);
		ls.add("Hello");
		ls.add('a');
		
		List lt=new ArrayList();
		lt.add(1); lt.add(2); lt.add(3);
		
		ls.addAll(lt);
		System.out.println(ls);
		
		List l2=new ArrayList();
		l2.add("Hello");
		l2.add(1);
		l2.add(10);
		
		System.out.println(ls.containsAll(l2));
		
		//l2.indexOf(l2);
		
		System.out.println(l2.indexOf(l2));
		
		
	}
}
