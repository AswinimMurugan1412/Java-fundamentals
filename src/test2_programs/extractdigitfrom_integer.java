package test2_programs;

import java.util.Scanner;

public class extractdigitfrom_integer {

	public static void main(String[] args) {
		int m,n,a,i=1,counter=0;
		Scanner s = new Scanner(System.in); 
		System.out.println("enter the number");
		n=s.nextInt();
		m=n;
		while (n>0)
		{
			n=n/10;
			counter++;
		}
		while(m>0)
		{
			a=m%10;
			System.out.println("digits at position"+counter+":"+a);
			m=m/10;
			counter--;
		}
	}
}
			
			
		

	


