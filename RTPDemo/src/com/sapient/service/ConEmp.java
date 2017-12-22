package com.sapient.service;

public class ConEmp extends Emp {
private int days;
	public ConEmp(int eid, String ename, double sal,int days) {
		super(eid, ename, sal);
this.days=days;
	}

	public double calSal() {
		
		return (getSal()*days);
	}
	public void display(){
		super.display();
		System.out.printf("%30d%20.2f%20s\n",days,calSal(),getClass().getSimpleName());
	}

}
