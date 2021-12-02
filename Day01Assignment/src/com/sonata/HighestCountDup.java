package com.sonata;

public class HighestCountDup {
	public void MaxRepeatingElement(int [] arrA){
		int maxCounter = 0;
		int element=0;

		for (int i = 0; i <arrA.length ; i++) {
		int counter =1;
		for (int j = i+1; j <arrA.length ; j++) {
		if(arrA[i]==arrA[j]){
		counter++;
		}
		}
		if(maxCounter<counter){
		maxCounter=counter;
		element = arrA[i];
		}
		}
		System.out.println("Element repeating maximum no of times: " + element + ", maximum count: " + maxCounter);
	}



	public static void main(String[] args) {
	int [] arrA = {4, 1, 5, 2, 1, 4, 9, 4, 6, 5, 3, 2, 4, 7};
	HighestCountDup m = new HighestCountDup();
	m.MaxRepeatingElement(arrA);
	}
	}

