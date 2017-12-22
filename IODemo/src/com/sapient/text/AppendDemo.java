package com.sapient.text;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AppendDemo {
public static void main(String[] args) throws IOException{
	FileWriter fw=new FileWriter("sap.txt",true);
	BufferedWriter bw=new BufferedWriter(fw);
	bw.write("hai\n");
	bw.write("hello\n");
	bw.close();
	fw.close();
}
}
