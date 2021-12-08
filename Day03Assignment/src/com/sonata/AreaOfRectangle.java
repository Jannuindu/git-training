package com.sonata;

public class AreaOfRectangle extends Shape {
	public double rectangle(double length, double width) {
		return length * width;
	}
	public static void main(String[] args) {
		AreaOfRectangle ar = new AreaOfRectangle();
		System.out.println("Area of Rectangle is : "+ar.rectangle(3.4, 7.8));
}
}