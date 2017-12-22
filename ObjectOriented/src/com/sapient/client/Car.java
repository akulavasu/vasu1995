package com.sapient.client;

public class Car {
	private int id;
	private int amt=22;
public Car(int id)throws Exception{
	if(id<1000)throw new Exception("carid>1000 ");
	this.id=id;
	System.out.println(id);
}


public void rim(int d){
	System.out.println(id+d);
}
}
