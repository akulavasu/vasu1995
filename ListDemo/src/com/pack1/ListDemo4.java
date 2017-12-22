package com.pack1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo4 {

	public static void main(String[] args) {
		List<String> lst=new ArrayList<String>();
		lst.add("ram");
		lst.add("sita");
		lst.add("lax");
		lst.add("bart");
		lst.add("satrgn");
		ListIterator<String> it2=lst.listIterator();
		while( it2.hasNext()){
			System.out.println(it2.next());
		}
		
		while( it2.hasPrevious()){
			System.out.println(it2.previous());
		}
	}

}
