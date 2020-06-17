package com.capg.collections;
import java.util.*;
public class Account {

   private String AccountID;
   private String AccountName;
   private int Amount;
//   private String AccountHolderName;
   private String Address;

   
   public String getAccountID() {
	return AccountID;
}


public void setAccountID(String accountID) {
	AccountID = accountID;
}


public String getAccountName() {
	return AccountName;
}


public void setAccountName(String accountName) {
	AccountName = accountName;
}


public int getAmount() {
	return Amount;
}


public void setAmount(int amount) {
	Amount = amount;
}




public String getAddress() {
	return Address;
}


public void setAddress(String address) {
	Address = address;
}

   
   
   public void depositAmount(int damount) 
   
   {
	   Amount=damount;
	   
      System.out.println(" Rupees "+Amount+" deposited in the account successfully");	   
   }
   
   
   public void getDetails()
   {
	   
	   
   }
   
   
   public void showDetails()
   {
	   System.out.println("****Account Details******");
	   System.out.println("AccountID : "+AccountID);
	   System.out.println("Account Name : "+AccountName);
	   System.out.println("Amount : "+Amount);
	   System.out.println("Address : "+Address);
   }
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account act=new Account();
		System.out.print("Enter Account number : "); 
		Scanner sc=new Scanner(System.in);
		act.setAccountID(sc.next());
		
		
		System.out.print("Enter Account Name : "); 
		Scanner sc1=new Scanner(System.in);
		act.setAccountName(sc1.next());
		
		System.out.print("Enter Address : "); 
		Scanner sc2=new Scanner(System.in);
		act.setAddress(sc2.next());
		
		System.out.print("Enter Amount  : "); 
		Scanner sc3=new Scanner(System.in);
		act.setAmount(Integer.parseInt(sc3.next()));
	
		ArrayList alist=new ArrayList();
		alist.add(act.AccountID);
		alist.add(act.AccountName);
		alist.add(act.Address);
		alist.add(act.Amount);
		
		
		System.out.println("\n\t");
		act.showDetails();
		System.out.println("\n\t");
		System.out.println("Details from Array List : "+alist);
	}

}
