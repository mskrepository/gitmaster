package com.capg.collections;
import java.util.*;

public class DemoMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Map deals key value pair
		//values can be dupicated
		Map map=new HashMap();
		
		map.put(12,"Hello");
		map.put(10.0,"World");
		map.put("Abc","abc");
		map.put(true,1);
		map.put(1.3f,"Hello");
		map.putIfAbsent(12, "World");
		Set setkey=map.keySet();
		System.out.println(setkey);
		System.out.println(map);
		
		
	}

}
