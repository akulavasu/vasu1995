package com.sapient.client;

import java.util.Scanner;

import com.sapient.service.Mtable;

public class MtableClient {
public static void main(String[] args){
	try {
	Mtable obj=	new Mtable(new Scanner(System.in).nextInt());
		obj.display(8);
	} catch (Exception e) {
		System.out.println(e.getMessage());
		
	}
}
}
