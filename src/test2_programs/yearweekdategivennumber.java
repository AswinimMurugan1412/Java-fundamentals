package test2_programs;

import java.util.Scanner;

public class yearweekdategivennumber {

	public static void main(String[] args) {
		int n,m,a,year,week,days;
		Scanner s = new Scanner(System.in); 
		System.out.println("enter the number days");
		m=s.nextInt();
        	year=m/365;
        	m=m%365;
        	System.out.println("year"+year);
        	week=m/7;
        	m=m%7;
        	System.out.println("week"+week);
        	days=m;
        	System.out.println("days"+days);
        	
      
	}
}

	