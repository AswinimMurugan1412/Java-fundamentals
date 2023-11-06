package test2_programs;

import java.util.Scanner;

public class countnumberof_bits {

	public static void main(String[] args) {
		int n,m,count=0;
		String x="";
		Scanner s = new Scanner(System.in); 
		System.out.println("enter the decimal numbers:");
		n=s.nextInt();
		while(n>0) {
			int a=n%2;
			x=a+x;
			n=n/2;                         //n=15...n=15/2=7
		}
		int l=x.length();
		for(int i=0;i<l;i++)
		{
			if(x.charAt(i)=='1')
			{
				count++;
			} 
		}
			System.out.println("No.of 1's are:"+count);
			
		}
		

	}


