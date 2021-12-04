package com.sonata;

public class Student {
int stdId;
	String stdName;
	int stdClass;
	Student(int a,String b,int c){
		this.stdId=a;
		this.stdName=b;
		this.stdClass=c;
	}
	public void display() {
		System.out.println(stdId);
		System.out.println(stdName);
		System.out.println(stdClass);	
	}
	public static void main(String args[]) {
		Student s1=new Student(1,"INDU",10);
		s1.display();
		Student s2=new Student(2,"HARITHA",10);
		s2.display();
	}
}
	
