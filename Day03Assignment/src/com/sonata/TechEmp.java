package com.sonata;

public class TechEmp extends AbstractEmp {

			TechEmp(int a, String b, Address c, double d, int e){
				super(a,b,c,d,e);
			}
			@Override
			public double calculateSal() {
				double HRA = super.BasicPay * 0.12 ;
				return HRA + super.BasicPay ;
			}
			public String toString() {
				return "Employee Id : "+ super.EmployeeID + "\n" + "Employee Name : " + super.EmployeeName;
			}
}
