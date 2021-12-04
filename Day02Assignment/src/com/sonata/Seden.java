package com.sonata;

public class Seden extends Car{
	int length;
	Seden(int speed,double regularPrice,String color,int length)
	{
		super(speed,regularPrice,color);
		this.length=length;
	}
	public double getSalePrice()
	{
		if(length>20)
		{
			return super.getSalePrice()-(super.getSalePrice()*0.5)	;
		}
		else
		{
			return super.getSalePrice()-(super.getSalePrice()*0.1);
		}
}
}