package com.sapient.service;

public class Mobile extends Product{
private String cam;
	public Mobile(int prodId, String prodName, double price,String cam) {
		super(prodId, prodName, price);
		this.cam=cam;
			}


	public String isExpensive() {
		double price=getPrice();
		String res=null;
		if(price>=10000) res="expensive";
		else if(price>=5000) res="average";
		else res="cheap";
		return res;

	
	}
	public void display(){
		super.display();
		System.out.printf("%20s%20s%20s\n",cam,isExpensive(),getClass().getSimpleName());
	}

}
