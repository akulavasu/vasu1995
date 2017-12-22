package com.sapient.client;

import java.util.Scanner;

import com.sapient.service.Circle;

public class CircleClient {
public static void main(String[] args) {
	System.out.println("enter the radius");
	try {
		Circle obj=new Circle(new Scanner(System.in).nextDouble());
		System.out.println("area" +obj.area());
		
		System.out.println("perimeter" +obj.perimeter());
	} catch (Exception e) {
	System.out.println(e.getMessage());
	}
}

}
