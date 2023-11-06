package test_programs;

import java.util.Scanner;
                                         //6804
public class harshad {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=s.nextInt();
		int temp=num;
		int rem,sum=0;
		while(temp>0)
		{
			rem=temp%10;
			temp /=10;
			sum=sum+rem;
		}
		if (num%sum==0)
			System.out.println("harshad number");
		else
			System.out.println("not a harshad number");
		}
		


	}


