
package com.sapient.demos;

import java.util.Scanner;

public class Cicle2 {
	private double radius;
	public Cicle2 (double radius)throws Exception{
		super();
		if(radius<=0)
			throw new Exception("radius must be greater than zero");
		this.radius=radius;
	}
	public static void main(String []args) throws Exception{
		Scanner vasu=new Scanner(System.in);
		System.out.println("enter radius");
		double r=vasu.nextDouble();
		Cicle2 cc=new Cicle2(r);
		System.out.println("Area of circle is" +cc.area());
		System.out.println("perimeter of circle is" +cc.perimeter());
		vasu.close();
		
	}
	public double area(){
		double ar=Math.PI*radius*radius;
		return ar;
	}
	public  double perimeter(){
		double pr=Math.PI*radius*2;
		return pr;
	}

}
