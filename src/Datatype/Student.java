package Datatype;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		int rollno,age;
		long contact;
		String name;
		char gender;
	
	
		try (Scanner s = new Scanner (System.in)) {
			System.out.println("Enter the rollno: ");
			rollno= s.nextInt();
			System.out.println("Enter the Name: ");
			name=s.next();
			System.out.println("Enter the contact: ");
			contact =s.nextLong();
			System.out.println("Enter the gender: ");
			gender =s.next().charAt(0);
			System.out.println("Enter the age: ");
			age=s.nextInt();
		}
		System.out.println("rollno: "+rollno);
		System.out.println("Name: "+name);
		System.out.println("contact: "+contact);
		System.out.println("gender: " +gender);
		System.out.println("Age: "+age);
		
		
		
				
		

	}

}
