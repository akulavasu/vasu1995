package com.pack1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo2 {
	public static void main(String[] args){
	Emp e1=new Emp(1001,"ram",21000);
Emp e2=new Emp(1002,"sam",31000);
Emp e3=new Emp(1003,"tom",55000);

Emp e5=new Emp(1005,"car",13000);
Emp e4=new Emp(1004,"lam",87000);
Emp e6=new Emp(1004,"lam",87000);
Emp e7=e2;
Set <Emp> set=new HashSet<Emp>();
set.add(e1);
set.add(e2);
set.add(e3);
set.add(e4);
set.add(e5);
set.add(e6);
set.add(e7);
for (Emp emp:set)
	System.out.println(emp);
}
}