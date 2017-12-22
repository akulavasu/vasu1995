package com.sapient.service;

public abstract class Emp {
private int eid;
private String ename;
private double sal;

public Emp(int eid, String ename, double sal) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.sal = sal;
}
public double getSal() {
return sal;
}	
public abstract double calSal();
public void display(){
	System.out.printf("%10d%20s%10.2f",eid,ename,sal);
}
}
