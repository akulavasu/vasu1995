package com.sapient.service;

import java.math.BigInteger;

public class Calculator implements Basic,Interest,Factorial{
   private static Calculator calc=new Calculator();
   private Calculator(){
	   
   }
private static Basic getBasic(){
	Basic obj =calc;
	return obj;
}
public static Interest getInterest(){
	Interest obj=calc;
	return obj;
}
public static Factorial getFactorial(){
	Factorial obj=calc;
	return obj;
}
	public String convert2Binary(int num) {
		
		return Integer.toBinaryString(num);
	}


	public double calSimple(double amt, int years, float rate) {

		return amt*years*rate/100;
	}

	@Override
	public double calCompound(double amt, int years, float rate) {

		return amt*Math.pow((1+rate/100), years);
	}

	@Override
	public BigInteger findFact(int num) {
		BigInteger fact =BigInteger.ONE;
		for(int i=1;i<=num;++i){
			fact=fact.multiply(BigInteger.valueOf(i));
		}
		return fact;
	}
	@Override
	public int doSum(int... a) {
		return Interest.super.doSum(a);
	}
	

}
