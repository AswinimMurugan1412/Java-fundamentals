package Datatype;

import java.util.Scanner;
public class Student_mark1 {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
	int ID,mark1,mark2,mark3;
	String name;
	float total,average;
	
	Scanner s = new Scanner(System.in);
	System.out.print("Enter the ID: ");
	ID= s.nextInt();
	System.out.print("Enter the name: ");
	name= s.next();
	System.out.print("Enter the mark1: ");
	mark1= s.nextInt();
	System.out.print("Enter the mark2: ");
	mark2= s.nextInt();
	System.out.print("Enter the mark3: ");
	mark3= s.nextInt();
	total = mark1+mark2+mark3;
	average = total/3;
	System.out.println("Total marks="+total);
	System.out.println("average marks="+average);
	if (average>=90){
    System.out.println("Excellent");
      	}
	 else if (average>80 & average<=90){
     System.out.println("Verry good");
	 }
	 else if (average>=70 &average<=80){
	 System.out.println("Good");
	 }
	 else if (average>=60) {
	 System.out.println("Work hard");
	}
	 else if (average>=50) {
	 System.out.println("Poor");
	 }
		
	}
	}
		
	
	
	

