package com.pack1;



public class Emp implements Comparable<Emp>{

	
@Override
	public boolean equals(Object obj) {
Emp emp=(Emp) obj;
if(this.empId==emp.empId)
	return true;
else
    return false;
}
	public int hashCode() {
		return empId;
}

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
