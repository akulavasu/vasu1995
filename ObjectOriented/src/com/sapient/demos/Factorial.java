package com.sapient.demos;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
	
public static void main(String[] args){
	System.out.println("enter number");
	System.out.println(Factorial.fact(new Scanner(System.in).nextInt()));
	
}
public static BigInteger fact(int n){
	if(n==0)return BigInteger.ONE;
	else
	return  BigInteger.valueOf(n).multiply(fact(n-1));
	
}
}
