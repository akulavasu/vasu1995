package com.sapient.service;

public class Emp implements Cloneable {

public Emp(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}


protected void finalize() throws Throwable {
	System.out.println("this object is garbage collected for eid"+ eid);
}


public Emp clone() throws CloneNotSupportedException {
	return (Emp)super.clone();
}

private int eid;
private String ename;

@Override
public String toString() {
	return eid+ " "+ ename;	
}

public boolean equals(Object obj) {
	Emp emp=(Emp)obj;
	if(this==emp)return true;
	else if(this.eid==emp.eid && this.ename==emp.ename)
	return true;
	else
	return false;
}


}
