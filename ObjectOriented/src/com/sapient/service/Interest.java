package com.sapient.service;

public class Interest {
private double amt;
private int years;
private float rate;
public Interest(double amt,int years,float rate){
	this.amt=amt;
	this.years=years;
	this.rate=rate;
	calSimple();
	calCompound();
}
public   void calSimple(){
	double si=amt*years*rate/100;
	System.out.println("simple interest" + si);
}
public  void calCompound(){
	double ci=amt*Math.pow((1+rate/100),years);
	System.out.println("compound interest" + ci);
}


}
