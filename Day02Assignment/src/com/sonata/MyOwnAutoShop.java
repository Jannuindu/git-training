package com.sonata;

public class MyOwnAutoShop {
	public static void main(String args[])
	{
		Car car = new Car(4,100000,"red");
		Seden se = new Seden(20,40000," Blue",30);
		Ford f1 = new Ford(10,7987600,"pink",2015,7);
		Ford f2 = new Ford(3,4450000,"WHITE",1947,3);
		System.out.println("Car");
		car.display();
		System.out.println("Sale Price of Car:"+car.getSalePrice());
		System.out.println("Sedan");
		se.display();
		System.out.println(se.length);
		System.out.println("Sale Price of Sedan:"+se.getSalePrice());
		System.out.println("Ford 1");
		f1.display();
		System.out.println(f1.year);
		System.out.println(f1.manufacturerDiscount);
		System.out.println("Sale Price of ford1:"+f1.getSalePrice());
		System.out.println("Ford 2");
		f2.display();
		System.out.println(f2.year);
		System.out.println(f2.manufacturerDiscount);
		System.out.println("Sale Price of ford2:"+f2.getSalePrice());
	}



}
