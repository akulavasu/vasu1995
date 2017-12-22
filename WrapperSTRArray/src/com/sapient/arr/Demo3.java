package com.sapient.arr;

import java.util.Arrays;

public class Demo3 {
public static void main(String[] args){
	String[] arr={"ram","amtih","vikas","tom","raja"};
	
	String[] arr2=new String[arr.length];
	System.arraycopy(arr, 0, arr2, 0, arr.length);
	System.out.println(Arrays.toString(arr2));
}
}
