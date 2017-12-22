package com.sapient.client;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import com.sapient.dao.DaoFactory;
import com.sapient.dao.Idao;
import com.sapient.exception.IdException;
import com.sapient.exception.NotFoundException;
import com.sapient.vo.Emp;

public class EmpClient {
	static Scanner scan=new Scanner(System.in);
	static Idao dao=DaoFactory.getDaoInstance();
public static void main(String[] args){
	String strmenu=null;
	String opt=null;
	Menu emenu=null;
	do{
		System.out.println("Choose :\nADD\nEDIT\nREMOVE\nVIEW\nVIEWALL\n");
		strmenu=scan.next();
		try{
			emenu=Menu.valueOf(strmenu);
			processMenu(emenu);
			
		}catch(Exception ex){
			System.out.println("invalid menu option");
		}
		System.out.println("press y to continue");
		opt=scan.next();
	}while(opt.equalsIgnoreCase("y"));
	
}
public static void processMenu(Menu menu){
	switch(menu){
	case VIEWALL:
		viewAll();
		break;
	case VIEW:
		viewById();
		break;
	case ADD:
		add();
		break;
	}
	
}
public  static void viewAll(){
	List<Emp> lst=dao.viewEmployee();
	for(Emp emp:lst)
		System.out.println(emp);
}
public static void viewById(){
	System.out.println("enter employee id");
	int eid=scan.nextInt();
	try {
		Emp emp=dao.viewEmployee(eid);
		System.out.println(emp);
	} catch (NotFoundException e) {
		System.out.println(e.getMessage());
	}
	
}
public static void add(){
	System.out.println("enter eid");
	int eid=scan.nextInt();
	System.out.println("enter name");
	String name=scan.next();
	System.out.println("enter sal");
	double sal=scan.nextDouble();
	System.out.println("enter deptid");
	int did=scan.nextInt();
	System.out.println("enter date (dd-mm-yyyy)");
	String strdt=scan.next();
	DateTimeFormatter df= DateTimeFormatter.ofPattern("dd-MM-yyyy");
	LocalDate doj=LocalDate.parse(strdt,df);
	Emp emp=new Emp(eid,name,sal,did,doj);
	try {
		dao.addEmployee(emp);
	} catch (IdException e) {
		System.out.println(e.getMessage());
	}
	System.out.println("employee added successfully");
}
}
