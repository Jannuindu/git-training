package com.sonata;

public abstract class ProductforToy {
	int pId;
	String pName;
	double pPrice;

	ProductforToy(int n, String name, double b){
		this.pId = n;
		this.pName= name;
		this.pPrice=b;
		}

public abstract void demo();
	
	public double totalPrice(double pPrice) {
		double gst = 2f/100;
		//System.out.println(gst);
		double totalgst = gst * pPrice ;
		double total = totalgst + pPrice;
		return total;
	}
	public void display() {
		System.out.println("Product id is : "+pId);
		System.out.println("Product Name is : "+pName);
		System.out.println("Product Price is : "+pPrice);
	}
}
	

