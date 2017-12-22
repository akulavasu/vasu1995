package com.pack1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo1 {
public static void main(String[] args){
	Set <String> set=new HashSet<String>();
	set.add("sai");
set.add("varun");
set.add("tarun");
set.add("ram");
set.add("ravan");
for(String str:set)
	System.out.println(str);

}
}
