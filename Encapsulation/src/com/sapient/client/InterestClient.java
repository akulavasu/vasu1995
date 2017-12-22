package com.sapient.client;

import com.sapient.service.Interest;

public class InterestClient {
public static void main(String[] args){
	Interest obj=new Interest();
	try {
		obj.setAmt(6000);
		obj.setRate(0.3f);
		obj.setYears(4);
		System.out.println("simple interest is"+ obj.calSimple());
		System.out.println("compound interest is"+ obj.compound());
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
}
}
