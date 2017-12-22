package com.sapient.ser;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DesDemo {
public static void main(String[] args) throws IOException{
	FileInputStream fis=new FileInputStream("employee.txt");
	ObjectInputStream ois=new ObjectInputStream(fis);
	Emp emp=null;
	
		try {
			while(true){
			emp=(Emp) ois.readObject();
			System.out.println(emp);}
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
	
	ois.close();
	fis.close();
	
}
}
