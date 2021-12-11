package com.sonata;

import java.util.ArrayList;
import java.util.Iterator;


public class EmployeeImpl implements EmpInt {
	
	private static final Exception DuplicateEmployeeID = null;
	ArrayList<Employee> list=new ArrayList<Employee>();
	
	@Override
	public void addEmployee(Employee e) {
		// TODO Auto-generated method stub
		if (e.getEmpSalary()<10000){
			e.setEmpSalary(e.getEmpSalary()+5000);
		}
		try {
		for (Employee employee : list) {
			if(employee.getEmpId()==e.getEmpId()){
				throw DuplicateEmployeeID; 
			}
		}
		list.add(e);
		}catch (Exception e1) {
			// TODO Auto-generated catch block
			System.err.print("Entered employee id("+e.getEmpId()+") already exists\n");
		}
		
	}
	@Override
	public void deleteEmployee(Employee e) {
		// TODO Auto-generated method stub
		list.remove(e);
	}

	@Override
	public double yearSalary(Employee e) {
		// TODO Auto-generated method stub
		return e.getEmpSalary()*12;
	}

	@Override
	public double appSalary(Employee e) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public void displayEmployees(){
		System.out.println("ID\tName\t\tSalary");
		for (Employee employee : list) {
			System.out.println(employee);
		}
	}
	
}
