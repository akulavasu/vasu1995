package com.sapient.ser;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class SerializDemo extends ObjectOutputStream {
protected SerializDemo() throws IOException, SecurityException {
		super();
		
	}




protected void writeStreamHeader() throws IOException {

	reset();
}

public static void main(String[] args) throws IOException{
	/*Scanner s=new Scanner(System.in);
	System.out.println("enter eid");
	int eid=s.nextInt();
	System.out.println("enter name");
	String ename=s.next();
	System.out.println("enter salary");
	 double sal=s.nextDouble();*/
	
	FileOutputStream fos=new FileOutputStream("employee.txt");
	ObjectOutputStream oos=new ObjectOutputStream(fos);	
	Emp emp=new Emp(1001,"sai",6500);
	Emp emp2=new Emp(1002,"vas",5500);
	Emp emp4=new Emp(1003,"amr",3500);
	oos.writeObject(emp);
	oos.writeObject(emp2);
	oos.writeObject(emp4);
	oos.close();
	fos.close();
	System.out.println("serialized");
}
}
