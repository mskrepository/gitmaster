package com.cg.inherit;
import java.util.*;


public class AcceptDisplayDetails extends PermanentEmp{

	Scanner sc=new Scanner(System.in);

	public void Acceptdetails()
	{
	System.out.println("Enter The id name basic time");
	
    int id=sc.nextInt();
    String name=sc.next();
    float basic=sc.nextFloat();
    float time=sc.nextFloat();
	
	
	
    System.out.println("Enter VP, des,pf");
    float vp=sc.nextFloat();
    String desi=sc.next();
    float pf=sc.nextFloat();
    
	}
	
    public static void main(String[] args) {
		
	
//    PermanentEmp emp=new PermanentEmp(id,name,basic,time,vp,desi,pf);
//    emp.printDetail();
//    System.out.println("Package "+emp.calSalary());
//    
    }
  }
