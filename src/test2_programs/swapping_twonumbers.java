package test2_programs;

import java.util.Scanner;

public class swapping_twonumbers {

	public static void main(String[] args) {
		int m,n,temp;
		Scanner s = new Scanner(System.in); 
		System.out.println("enter the first number");
		m=s.nextInt();
		System.out.println("enter the second number");
		n=s.nextInt();
		temp = m;
		m=n;
		n=temp;
		System.out.println("after swap n number"+n);
		System.out.println("afterswap m number"+m);
	}

}
