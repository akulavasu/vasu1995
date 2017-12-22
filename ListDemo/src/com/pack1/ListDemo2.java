package com.pack1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListDemo2 {

	public static void main(String[] args) {
		List<String> lst=new ArrayList<String>();
		lst.add("ram");
		lst.add("sita");
		lst.add("lax");
		lst.add("bart");
		lst.add("satrgn");
		Collections.sort(lst);;
		for(String str:lst){
			System.out.println(str);
		}
		Collections.sort(lst,Collections.reverseOrder());
		System.out.println(lst);
	}

}
