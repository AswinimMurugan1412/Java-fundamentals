package test_programs;

import java.util.Scanner;

public class amst_test {

	public static void main(String[] args) {
		int digit=0,num,remainder,result = 0,temp;
		Scanner s=new Scanner(System.in);
		System.out.print("enter the number:");
		num=s.nextInt();
		temp=num;
		while(num!=0) {
			digit++;
			num=num/10;
		}
		num=temp;
		while(num!=0) {
			remainder=num%10;
			result=(int)(result+Math.pow(remainder, digit));
			num=num/10;
		}
		if(temp==result) {
			System.out.println("amstrong number");
		}
		else {
			System.out.println("Not an amstrong number");
		}
		s.close();
			
		}

	}

