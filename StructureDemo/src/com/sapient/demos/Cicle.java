package com.sapient.demos;

import java.util.Scanner;

public class Cicle {
	public static void main(String []args){
		Scanner vasu=new Scanner(System.in);
		System.out.println("enter radius");
		double r=vasu.nextDouble();
		System.out.println("Area of circle is" + area( r));
		System.out.println("perimeter of circle is" + perimeter(r));
		vasu.close();
		
	}
	public static double area(double radius){
		double ar=Math.PI*radius*radius;
		return ar;
	}
	public static double perimeter(double radius){
		double pr=Math.PI*radius*2;
		return pr;
	}

}
