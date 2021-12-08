package com.sonata;

public class TriangleArea {
	public double Triangle(double base , double height)
	{
		return (base * height)/2;
	}
	public static void main(String[] args) 
	{
		
		TriangleArea ar = new TriangleArea();
		System.out.println("Area of Triangle : "+ar.Triangle(34, 21));
		
	}
}
