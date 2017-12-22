package com.sapient.demos;

public class VarArgsDemo {
public static void main(String[] args){
	System.out.println(sum(2,3,3,312));
}
public static int sum(int...arr){
	int sum=0;
	for(int i=0;i<arr.length;++i){
		sum=sum+arr[i];
	}
	return sum;
}
}
