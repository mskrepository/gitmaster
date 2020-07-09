package com.cg.org;

public class Bank {

	
	private String pin;
	
	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public int acc_no;
	protected float balance;
	
	
	public Bank()
	{
		pin="123";
		acc_no=810456;
		balance=20000.00f;
	}
	
	public Bank(String p, int ac, float bal)
	{
		pin=p;
		acc_no=ac;
		balance=bal;
		
	}
	
	public void showCustDetails()
	{	System.out.println("****Variable values****");
		System.out.println("pin :"+pin);
		System.out.println("acc_no :"+acc_no);
		System.out.println("balance :"+balance);
		
		System.out.println("\n");
		
		System.out.println("****Customer details****");
		System.out.println("Customer pin  : "+pin);
		System.out.println("Account No    : "+acc_no);
		System.out.println("Balance       : "+balance);
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bk=new Bank();
		System.out.println("\n");
		bk.showCustDetails();
		
		System.out.println("\n");
		
		Bank bk1=new Bank("456",96782,50000.00f);
		bk1.showCustDetails();
		
		
	}

}
