package com.sapient.service;

public class Interest {
private double amt;
private float rate;
private double years;
public double getAmt() {
	return amt;
}
public void setAmt(double amt)throws Exception {
	if(amt<5000)throw new Exception("amt >5000");
	this.amt = amt;
}
public float getRate() {
	return rate;
}
public void setRate(float rate)throws Exception  {
	if(rate<0 || rate> 0.6)throw new Exception("rate between 0 to 0.6");
	this.rate = rate;
}
public double getYears() {
	return years;
}
public void setYears(double years)throws Exception {
	if(years<1 || years> 10)throw new Exception("years between 1 to 10");
	this.years = years;
}
public  double calSimple(){
	double si=amt*years*rate/100;
	return si;
}
public  double compound(){
	double ci=amt*Math.pow((1+rate),years);
	return ci;
}
}
