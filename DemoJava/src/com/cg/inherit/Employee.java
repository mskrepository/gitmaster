package com.cg.inherit;

public class Employee {
    int empid;
    String name;
    float basic;
    float time;
    
    public Employee()
    {
        empid=101;
        name="abc";
        basic=1232.4f;
        time=1.2f;
    }
    
    public void printDetail()
    {
        System.out.println(empid);
        System.out.println(name);
        System.out.println(basic);
        System.out.println(time);
    }

 public static void main(String[] args) {
	Employee emp=new Employee();
	emp.printDetail();
}

}
 