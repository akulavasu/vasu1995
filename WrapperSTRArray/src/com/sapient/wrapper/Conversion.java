package com.sapient.wrapper;

public class Conversion {
public static void main(String[] args){
	int dec=45;
	System.out.println("binary"+ Integer.toBinaryString(dec)) ;
	System.out.println("octal" +Integer.toOctalString(dec));
	System.out.println("hexa decimal"+Integer.toHexString(dec));
}
}
