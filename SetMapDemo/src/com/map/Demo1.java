package com.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.pack1.Emp;

public class Demo1 {
public static void main(String[] args){
	Emp e1=new Emp(1003,"tom",55000);
    Emp e2=new Emp(1005,"car",13000);
	Emp e3=new Emp(1004,"lam",87000);
	Map<Integer,Emp>map=new HashMap<Integer,Emp>();
	map.put(1003, e1);
	map.put(1005, e2);
	map.put(1004, e3);
	Scanner scan=new Scanner(System.in);
	System.out.println("enter employeeid");
	int eid=scan.nextInt();
	
     if(map.containsKey(eid)){
	    Emp e=map.get(eid);
        System.out.println(e);
}
}
}