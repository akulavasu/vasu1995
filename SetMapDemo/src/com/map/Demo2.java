package com.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Demo2 {
public static void main(String[] args){
	Map<Integer,String> map=new HashMap<Integer,String>();
	map.put(1005,"ram");
	map.put(1006,"cam");
	map.put(1004,"sri");
	map.put(1007,"jai");
	map.put(1003,"tom");
	
	map.put(1005,"sam");
	map.put(null,"vasu");
	Set<Integer> set=map.keySet();
	for(Integer key:set)
		System.out.println(key+"  "+map.get(key));
	//iterating using values
	Collection<String>col=map.values();
	for(String str:col)
		System.out.println(str);
	//iterating using entries
	Set<Entry<Integer,String>> entries=map.entrySet();
	for(Entry e:entries)
		System.out.println(e.getKey()+" "+e.getValue());
	
}
}
