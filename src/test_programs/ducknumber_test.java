package test_programs;

import java.util.Scanner;

public class ducknumber_test {
                                           //3012....//0987
	public static void main(String[] args) {
		int n,x=0;
		boolean isDuck=false;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		n=sc.nextInt();
		int d=0,f=0;
		while(n!=0)
		{
			d=n%10;
					if(d==0)
					{
						isDuck=true;
					}
			n/=10;
		}
		if(isDuck)
		{
			System.out.println("duckno ");
		}
		else {
			System.out.println("not a duckno");
			
					}
		}
		

		

	}


