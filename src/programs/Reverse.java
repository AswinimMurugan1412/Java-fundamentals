package programs;

import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num,result=0,remainder;
		System.out.print("Enter the number:");
		num=s.nextInt();
		while(num!=0)
		{
			remainder=num%10;
			result= result*10+remainder;
			num=num/10;
		}
		
		System.out.println("Result="+result);
		if(num==result) {
			System.out.println("it is a palindrome:");
			
		}
		else if(num!=result) {
			System.out.println("it is a not a palindrome:");
		}
			
		
		s.close();

	}

}
