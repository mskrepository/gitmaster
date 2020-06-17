package com.capg.exceptions;
import java.util.*;


public class SalaryComparator implements Comparator<Employee> {

	 

    @Override
    public int compare(Employee o1, Employee o2) {
        if(o1.getEmpSal()>o2.getEmpSal())
        return 1;
        else if(o1.getEmpSal()==o2.getEmpSal())
            return 0;
        else return -1;
    }

 

    
}
 