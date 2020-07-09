package com.capg.exceptions;

public class EmployeeNotFoundException extends Exception{
    String msg;

 

    public EmployeeNotFoundException(String msg) {
        super();
        this.msg = msg;
    }
    

 

}
 