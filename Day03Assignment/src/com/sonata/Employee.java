package com.sonata;

public class Employee extends MyOwnException implements MyInterface{
	int  empId;
	String empName;
	double empSal;

	public Employee(int a, String b, double c, String d) {
		super(d);
		this.empId = a;
		this.empName = b;
		this.empSal = c;
	}
	public void display() {
		System.out.println("Employee id is : "+empId);
		System.out.println("Employee Name : "+empName);
		System.out.println("Employee Salary : "+empSal);
	}
	@Override
	public void saCal() throws MyOwnException {
		System.out.println("Employee SalCal method......");
		double yearlySal = empSal * 12;

			if(yearlySal < 100000) {
				throw new MyOwnException("Your yearly Salary lessthgan 1 lakh...");
			}else {
				System.out.println("Your yearly salary gretherthan 1 lakh.......... ");
			}
	}
	public static void main(String[] args) throws MyOwnException {
		Employee emp = new Employee(101, "kira", 27000 , "hlo");
		emp.saCal();
	}
}

