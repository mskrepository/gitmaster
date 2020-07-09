package com.capg.collections;
import java.util.*;


//int acctno, float balance, float roi
//create a list of 5 accounts... store it in ArrayList
//Present account number and its balance(store it in map as key value pair)
//based on accno we will search for account details

public class Account1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * List<Object> list = new ArrayList<>();
Map<Integer, List<Object>> map = new HashMap<>();
map.put(1,list);
		 * 
		 * 
		*/
		
		ArrayList<Integer> acctno=new ArrayList<Integer>();
		
		acctno.add(1001);
		acctno.add(1002);
		acctno.add(1003);
		acctno.add(1004);
		acctno.add(1005);
		
		Map<Integer, ArrayList<Object>> map = new HashMap<>();
		
		//HashMap map=new HashMap();
		//map.put("Accounts",acctno);
		
		//map.put(accounts, acctno);;
		
		
		
		
		
	}

}
