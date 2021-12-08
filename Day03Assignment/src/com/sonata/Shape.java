package com.sonata;

public class Shape {
	double length;
	double height;
	double width;

	public double rectangle(double length, double width) {
		return length * width;
	}
	public double square(double length) {
		return length * length;
	}
	public double triangle(double base , double height) {
		return (base * height)/2;
	}
}
