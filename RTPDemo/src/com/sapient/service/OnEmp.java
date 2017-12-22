package com.sapient.service;

public class OnEmp extends Emp {
private double da,pf;
	public OnEmp(int eid, String ename, double sal) {
		super(eid, ename, sal);
	da=calDa();
	pf=calPf();
	}
private double calPf(){
	return getSal()*0.12;
}
	private double calDa(){
		return getSal()*0.4;
	}
	public double calSal() {
		
		return (getSal()+da)-pf;
	}
	public void display(){
		super.display();
		System.out.printf("%10.2f%10.2f%30.2f%20s\n",da,pf,calSal(),getClass().getSimpleName());
	}

}
