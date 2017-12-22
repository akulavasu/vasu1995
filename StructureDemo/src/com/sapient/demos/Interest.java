package com.sapient.demos;

import java.util.Scanner;

public class Interest {
	public static void main(String []args){
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the amount");
		double principle=scan.nextDouble();
	System.out.println("enter the years");
	int terms=scan.nextInt();
	System.out.println("enter the rate");
	float r=scan.nextFloat();
	System.out.println("simple interest is" + calSimple(principle,terms,r));
	System.out.println("compound interest is" + compound(principle,terms,r));
	scan.close();
	}
	public static double calSimple(double amt,double years,float rate){
		double si=amt*years*rate/100;
		return si;
	}
	public static double compound(double amt,double years,float rate){
		double ci=amt*Math.pow((1+rate/100),years);
		return ci;
	}

}
