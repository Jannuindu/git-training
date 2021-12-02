package com.sonata;

public class DuplicateNum {
	public static void main( String[] args ){
		int[] arr ={1,2,3,4,6,2,12};
    for(int i=0;i<arr.length-1;i++)
    {
	for(int j=i+1;j<arr.length-1;j++)
	{
		if(arr[i]==arr[j])
		{
			System.out.println("Duplicate number is : "+arr[j]);
		}
	}
    }
}
}