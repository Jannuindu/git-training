package com.sonata;

public class TShirt {
    String color;
	String material;
	String design;
	String Size;
	
	public TShirt(String a,String b,String c,String d) {
		
	
	this.color=a;
	this.material=b;
	this.design=c;
	this.Size=d;
	
	}
	
	public void small() {
		
		System.out.println("This is Small size");
		
	}
	
	public void Medium() {
		System.out.println("This is  medium size");
		
	}
	public void Large() {
		System.out.println("This is Large size");
	}
	
	public void display() {
		System.out.println("Color of TShirt: "+color);
		
		System.out.println("Material of TShirt: "+material);
		
		System.out.println("Design of TShirt: "+design);
	
		System.out.println("Size of TShirt: "+Size);
		
	}
	
	public static void main(String[]args) {
		TShirt t1=new TShirt("pink","silk","Fullsleave","S");
		System.out.println();
		t1.display();
		t1.small();
		TShirt t2=new TShirt("blue","cotton","sleaveless","X");
		System.out.println();
		t2.display();
		t2.Large();
		TShirt t3=new TShirt("violet","silk","Fullsleave","M");
		System.out.println();
		t3.display();
		t3.Medium();
	}
}



