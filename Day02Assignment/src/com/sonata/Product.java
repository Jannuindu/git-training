package com.sonata;

public class Product {
	int proid;
	String proname;
	 double proPrice;
	
	Product(int a,String b,double c){
		this.proid=a;
		this.proname=b;
		this.proPrice=c;
		
	}
	public double Totalbill(double GST) {
		double total=proPrice*GST;
		return total;
	}
	
	public void display() {
		System.out.println("Productid: "+proid);
		System.out.println("Product : "+proname);
		System.out.println("Price of Product: "+proPrice);
	}
	
	public static  void main(String[]args) {
		Product p1=new Product(111,"LAPTOP",100000);
		p1.display();
		double tax=p1.Totalbill(0.02);
		System.out.println("TAX : " +tax);
		double total=tax+100000;
		System.out.println( "TOTAL :" +total);
	}
}

