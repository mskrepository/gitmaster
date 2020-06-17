package com.capg.exceptions;
import java.util.Scanner;

public class DemoException {

	 int balance;
	   
	    public DemoException() {
	        balance=5000;
	    }
	   
	    public void withdraw() throws MinimumBalanceException
	    {
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter emt to withdraw");
	        int amt=sc.nextInt();
	        if(balance-amt<4000)
	        {
	            throw new MinimumBalanceException("min bal must be 4000Rs/-");
	           
	        }
	    }
	}
	 