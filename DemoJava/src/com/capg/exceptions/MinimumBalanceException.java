package com.capg.exceptions;

public class MinimumBalanceException extends Exception
{
	
	String msg;
 

	public MinimumBalanceException(String msg) {
	    super();
	    this.msg = msg;
	}

	 

}
