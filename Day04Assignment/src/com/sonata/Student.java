package com.sonata;


public class Student {
	String name;
	int id;
	int Marks;
	Student(String n,int k,int m){
		name=n;
		id=k;
		Marks=m;
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public int getMarks() {
		return Marks;
	}
	@Override
	public String toString() {
		return ("Student: ["+"Name: "+this.getName() +"  , "+ "Id:"+ this.getId()  + " ,  "+ "Marks:" +this.getMarks()+ "]");
	}
}