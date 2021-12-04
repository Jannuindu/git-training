package com.sonata;

public class Car {
	
	
		int speed;
		double Price;
		String color;
		Car(int speed ,double regularPrice,String color)
		{
			this.speed = speed;
			this.Price=regularPrice;
			this.color=color;
		}
		public double getSalePrice()
		{
			return Price;
		}
		public void display()
		{
			System.out.println(speed);
			System.out.println(Price);
			System.out.println(color);
			
		}
		
	}


