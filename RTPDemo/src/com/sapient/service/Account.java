package com.sapient.service;

public abstract class Account {

private String acName;
private int aid;
private double bal;
public Account(String acName, int aid, double bal) {
	super();
	this.acName = acName;
	this.aid = aid;
	this.bal = bal;
}
public void display(){
	System.out.printf("%10d%20s%10.2f",aid,acName,bal);
}
public abstract String deposit();
}
