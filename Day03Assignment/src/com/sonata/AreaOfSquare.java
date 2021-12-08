package com.sonata;

public class AreaOfSquare {
	public double square(double length) {
		return length * length;
	}

	public static void main(String[] args) {
		AreaOfSquare ar = new AreaOfSquare();
		System.out.println("Area of Square is : "+ar.square(3.4));

	}
}
