package com.sapient.wrapper;

public class Boxing {
	public static void main(String[] args){
		//boxing
	Integer a=new Integer(20);
	Integer b=Integer.valueOf(30);
	//unboxing
	int res=a.intValue()+b.intValue();
	Integer r=Integer.valueOf(res);//boxing
	System.out.println(r);
	}
}
