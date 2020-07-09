package com.capg.exceptions;

public class TestException {

	 public static void main(String[] args) {
	        try{
	        DemoException de=new DemoException();
	        de.withdraw();
	        }
	        catch(MinimumBalanceException e)
	        {
	            e.printStackTrace();
	        }

	 

	    }

	 

	}