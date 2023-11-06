package test_programs;

import java.util.Scanner;

public class leapyear {

	public static void main(String[] args) {
		int year;
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the year: ");
		year=s1.nextInt();
		if(year%4==0) {
		System.out.println("yes ");
		
	}
		else {
		System.out.println("No ");
	

	}
	}
}



