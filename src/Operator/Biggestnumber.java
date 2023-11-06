package Operator;

import java.util.Scanner;

public class Biggestnumber {

	public static void main(String[] args) {
	int a,b,c;		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
	    a= s. nextInt();
	    System.out.println("Enter the number");
	    b= s. nextInt();
	    System.out.println("Enter the number");
	    c= s. nextInt();
	    
		if(a>b &&a>c) {
		System.out.print("bigger number is="+a);
	}
	else if(b>a&&b>c)  {
		System.out.print("bigger number is="+b);
	}
		
		else if(c>a&&c>b)  {
			System.out.print("bigger number is="+c);
		}
		
			
	}
	}


