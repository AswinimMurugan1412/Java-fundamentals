package test2_programs;

import java.util.Scanner;

public class testcaseincrement1digit {

	public static void main(String[] args) {
		int m,n,a;
		String s1="";
		Scanner s = new Scanner(System.in); 
		System.out.println("enter the number");
		n=s.nextInt();
		m=n;
		while(m>0)
		{
			a=m%10;
			a=a+1;
			s1=a+s1;
			m=m/10;
		}
		System.out.println(s1);
		}
}

	


