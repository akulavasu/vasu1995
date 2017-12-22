package com.sapient.service;

public class Mtable {
private int n;
public Mtable(int n) throws Exception{
	super();
	if(n<=0)
		throw new Exception ("number should be >0");
	this.n=n;
}
public void display(){
	showTable(1,10);
}
	public void display(int rows){
		showTable(1,rows);
}
	public void display(int start,int end)throws Exception{
		if(end >0 && start>0 && end>=start)
		showTable(start,end);
		else throw new Exception("start and end must be positive and end>=start");
}
	public void showTable(int start,int end ){
		for(int i=start;i<=end;++i){
			System.out.printf("%d * %d =%d\n",n,i,(n*i));
		}
}
}
