package com.capg.exceptions;

import java.util.Scanner;

public class TestEmployee {

 

    public static void main(String[] args) throws EmployeeNotFoundException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of Array");
        Employee emp[]=new Employee[sc.nextInt()];
        System.out.println("Enter empID, empName,empSala");
        for(int i=0;i<emp.length;i++)
        {
        emp[i]=new Employee(sc.nextInt(), sc.next(),sc.nextFloat());    
        }
        
        
        System.out.println("Enter empID to search");
        search(emp,sc.nextInt());

 

    }

 

    private static void search(Employee[] emp, int id) throws EmployeeNotFoundException {
    for(int i=0;i<emp.length;i++)
    {
        if(emp[i].getEmpId()==id)
        {
            System.out.println(emp[i]);
            System.exit(0);
        }
    }
    
    throw new EmployeeNotFoundException("Employee with ID "+id+ " Not found");
    
    
        
    }

 

}
 