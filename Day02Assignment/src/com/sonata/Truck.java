 package com.sonata;

public class Truck extends Car{
	int weight;
	Truck(int speed,double regularPrice,String color,int weight)
	{
		super(speed,regularPrice,color);
		this.weight=weight;
	}
	public double getSalePrice()
	{
		super.getSalePrice();
		if(weight>2000)
		{
			return this.getSalePrice()-(this.getSalePrice()*0.1);
		}
		else
		{
			return this.getSalePrice()-(this.getSalePrice()*0.2);
		}
}
}