package com.pack2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {
		Emp e1=new Emp(1001,"ram",21000);
Emp e2=new Emp(1002,"sam",31000);
Emp e3=new Emp(1003,"tom",55000);
Emp e4=new Emp(1004,"lam",87000);
Emp e5=new Emp(1005,"car",13000);
List<Emp> lst=new ArrayList<Emp>();
lst.add(e1);
lst.add(e2);
lst.add(e3);
lst.add(e4);
lst.add(e5);
Collections.sort(lst,new SalComparator());
for(Emp emp:lst)
	System.out.println(emp);
	}

}
