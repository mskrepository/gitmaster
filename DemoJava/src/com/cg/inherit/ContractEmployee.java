package com.cg.inherit;

public class ContractEmployee extends Employee {

	
	int contract_period=2;
	String contracCmpyname="Ramesh";
	int incentive=5000;
	
	
	 
    public void printDetail()
    {
        System.out.println(contract_period);
        System.out.println(contracCmpyname);
        System.out.println(incentive);
    }
	
    
    public void printSalary()
    {
    	
    	System.out.println(basic);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContractEmployee cemp=new ContractEmployee();
		cemp.printDetail();
		cemp.printSalary();
		
	}

}
