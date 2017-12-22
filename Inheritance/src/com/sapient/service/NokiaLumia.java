package com.sapient.service;

public class NokiaLumia extends Nokia1100 {
public void captureImage(){

	System.out.println("capture image");
}
public void browseNet(){
	System.out.println("browse net");
}
@Override
public void doConverse(){
	System.out.println("do converse 4g");
}
public void doConverse2g(){
	super.doConverse();
}
}
