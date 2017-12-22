package com.sapient.client;

import com.sapient.service.Computer;
import com.sapient.service.Mobile;
import com.sapient.service.Product;

public class ProductClient {

	public static void main(String[] args) {
	Product[] arr=new Product[4];
	arr[0]=new Computer(1001,"acer laptop",35000,"4tb");
	arr[1]=new Computer(1002,"dell laptop",15000,"2tb");
	arr[2]=new Mobile(1003,"samsung",15000,"1080p");
	arr[3]=new Mobile(1004,"lenovo",5000,"720p");
System.out.println("---------------------------------------------------------------------------------------------------");
	System.out.printf("%10s%20s%10s%10s%10s%20s%20s","PID","PNAME","PRICE","HDD","CAM","RANGE","TYPE\n");
System.out.println("---------------------------------------------------------------------------------------------------");
for(Product prod:arr){
	prod.display();
}
System.out.println("---------------------------------------------------------------------------------------------------");
	}

}
