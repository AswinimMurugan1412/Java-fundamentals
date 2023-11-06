package programs;

import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {
		int num,sum=0, lastnum,prod=1;
		Scanner s=new Scanner(System.in);
		System.out.print("enter the digit:");
		num=s.nextInt();
		int n=num;
		while(num>0) {
			lastnum=num%10;
			sum=sum+lastnum;
			prod=prod*lastnum;
			num=num/10;
			}
		System.out.println("sum of total digit="+sum);
		System.out.println("product of total digit="+prod );
		
			if(sum==prod) {
				System.out.print("it is a spy number");
			}
			else {
				System.out.print("not a spy number");
			}

}




	}


