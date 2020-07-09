package com.cg.inherit;

public class PermanentEmp extends Employee{
    float vp;
    String designation;
    float pf;
    public PermanentEmp() {
        vp=10000;
        designation="Consultant";
        pf=2000;
    }
    
    public void printDetail()
    {
        super.printDetail();
        System.out.println(vp);
        System.out.println(designation);
    }
    
    public float calSalary()
    {
        return basic+pf+vp;
    }

 

    

 

}