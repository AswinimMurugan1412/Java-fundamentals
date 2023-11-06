 package Operator;

import java.util.Scanner;

public class Month {

	public static void main(String[] args) {
		int month;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the month name:");
		month=s.nextInt();
		if(month==1) {
			System.out.print("january:");
			
		}
		else if (month==2) {
			System.out.print("Febuary:");
		}
		else if (month==3) {
			System.out.print("March:");
		}
		else if (month==4) {
			System.out.print("April:");
		}
		else if (month==5) {
			System.out.print("May:");
		}
		else if (month==6) {
			System.out.print("June:");
		}
		else if (month==7) {
			System.out.print("July:");
		}
		else if (month==8) {
			System.out.print("August:");
		}
		else if (month==9) {
			System.out.print("September:");
		}
		else if (month==11) {
			System.out.print("November:");
		}
		else if (month==12) {
			System.out.print("December:");
		}
	
	if(month==1|month==2) {
		System.out.print("summer");

	}
	if(month==3|month==4) {
		System.out.print("summer");
    }
	if(month==5|month==6) {
		System.out.print("rainy");
    }
	if(month==7|month==8) {
		System.out.print("rainy");
    }
	if(month==9|month==10) {
		System.out.print("winter");
    }
	if(month==11|month==12) {
		System.out.print("winter");

	}
	s.close();
			
		}
}
			
			
		
		

	


