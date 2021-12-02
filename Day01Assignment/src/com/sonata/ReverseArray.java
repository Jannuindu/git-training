package com.sonata;

public class ReverseArray {
	public static void main( String[] args ){
		int[] arr = new int[] {3,5,7,3,9,5};
		System.out.print("Reversed array is ");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i] +"");
		}
		}
}