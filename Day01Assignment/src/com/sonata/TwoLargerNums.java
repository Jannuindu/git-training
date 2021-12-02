package com.sonata;

public class TwoLargerNums {
	public static void main(String[] args) {
		 int numArray[]= {2,45,76,97,345,3456};
		int firstLarNum =0;
		int secLarNum =0;
		
		for(int i=0;i<numArray.length;i++) {
			if(firstLarNum<numArray[i]) {
				secLarNum = firstLarNum;
				firstLarNum = numArray[i];
			}
			else if (secLarNum < numArray[i]) {
				secLarNum =numArray[i];
			}
		}
		System.out.println(" First Largest number :" + firstLarNum + ", Second Largest number : " + secLarNum); 
	}
}
