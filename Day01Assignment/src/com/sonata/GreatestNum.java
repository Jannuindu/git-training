package com.sonata;

public class GreatestNum {
	public static void main(String args[]) {
		int a=12, b=25,c=89 ; 
		if(a>b)
		{
			if(a>c)
				System.out.print(a);
			else
				System.out.print(c);
		}
		else
		{
			if(b>c)
					System.out.print(b);
				else
					System.out.print(c);
			}	
		}
}
