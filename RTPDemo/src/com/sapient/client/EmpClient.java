package com.sapient.client;

import com.sapient.service.ConEmp;
import com.sapient.service.Emp;
import com.sapient.service.OnEmp;
import com.sapient.service.Product;

public class EmpClient {
public static void main(String[] args){
	Emp[] arr=new Emp[4];
	arr[0]=new OnEmp(1001,"amar",23000);
	arr[1]=new OnEmp(1002,"sam",33000);
	arr[2]=new ConEmp(1003,"avr",2000,3);
	arr[3]=new ConEmp(1004,"svr",2000,4);
	System.out.println("-------------------------------------------------------------------------------------------------------------");
	System.out.printf("%10s%20s%10s%10s%10s%10S%20s%20s","EID","ENAME","SAL","DA","PF","DAYS","NETSALARY","EMPLPOYEE\n");
System.out.println("-------------------------------------------------------------------------------------------------------------");
for(Emp em:arr){
	em.display();
}
System.out.println("-------------------------------------------------------------------------------------------------------------");
	}
	
}

