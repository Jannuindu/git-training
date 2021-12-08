package com.sonata;

public class UsingPeople {

public static void main(String[] args) {
		
		Address ad = new Address();
		TechEmp te = new TechEmp(1, "indu", ad, 27500, 5);
		
		Staff st = new Staff(102, "hari",ad, 10000, 5);
		
		te.display();
		System.out.println("Technical Employee Sal is : "+te.calculateSal());
		
		System.out.println("\n");
		st.display();
		System.out.println("Staff Sal is : "+st.calculateSal());
		
	}

}

