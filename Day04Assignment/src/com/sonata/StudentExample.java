package com.sonata;
import java.util.*;
public class StudentExample extends Student{
	StudentExample(String n, int k, int m){
		super(n,k,m);
	}
	 public static void main(String[] args) {
		  List<Student>studentlist=new ArrayList<Student>();
		   studentlist.add(new Student("Indu",01,98));
		   studentlist.add(new Student("Haritha",02,38));
		   studentlist.add(new Student("Teju",03,59));
		   studentlist.add(new Student("Hema",04,47));
		   System.out.println("before sorting the student data:");
		
	  
     studentlist.forEach((s1)->System.out.println(s1));

     studentlist.sort((Student s1, Student s2)->s1.getMarks()-s2.getMarks()); 
     
     System.out.println("After Sorting the student data by Marks:");        
   
     studentlist.forEach((s1)->System.out.println(s1)); 
	  }
}
