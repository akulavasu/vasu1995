package com.sapient.exception;

public class Demo1 {
public static void main(String[] args){
	System.out.println("LINE 1");
	System.out.println("Line 2");
	try{
	    int a=5/0;
	    System.out.println("try block");
	
	}catch(ArithmeticException ex){
		System.out.println(ex.getMessage());
		System.out.println("catch block");
		ex.printStackTrace();
	}
	System.out.println("LINE 3");
	System.out.println("Line 4");
	System.out.println("LINE 5");
	System.out.println("Line 6");
}
}
