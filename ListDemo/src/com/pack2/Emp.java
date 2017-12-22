package com.pack2;

public class Emp implements Comparable<Emp>{

	
public Emp(int empId, String ename, double sal) {
		super();
		this.empId = empId;
		this.ename = ename;
		this.sal = sal;
	}
private int empId;
private String ename;
private double sal;
public String toString() {
	
	return empId+" "+ename+" "+sal;
}

public int getEmpId() {
	return empId;
}

public String getEname() {
	return ename;
}

public double getSal() {
	return sal;
}

public int compareTo(Emp emp) {
	Integer e1=this.empId;
	Integer e2=emp.empId;
	return e1.compareTo(e2);
}

}
