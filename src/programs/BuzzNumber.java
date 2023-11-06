package programs;

import java.util.Scanner;

public class BuzzNumber {

	public static void main(String[] args) {
		int num;
		Scanner s=new Scanner(System.in);
		System.out.print("enter the digit:");
		num=s.nextInt();
		
		if(num%7==0 || num%10==7) {
			
				System.out.println("it is a buzz number");
			}
			else {
				System.out.println("not a buzz number");
			}
		s.close();
			}
		
}

	


