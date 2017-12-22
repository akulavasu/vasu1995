package com.pack1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo5 {
public static void main(String[] args){
	List<String> lst1=new ArrayList<String>();
	lst1.add("ram");
	lst1.add("sita");
	lst1.add("lax");
	lst1.add("bart");
	lst1.add("satrgn");
	
	System.out.println(lst1);
	lst1.add(1,"sai");
	System.out.println(lst1);
	List<String> lst2=new ArrayList<String>();
	lst2.addAll(lst1);
	System.out.println(lst2);
	
	
	
}
}
