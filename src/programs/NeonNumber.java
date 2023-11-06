package programs;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		int numsq,sum=0,num,lastdigit;
		Scanner s=new Scanner(System.in);
		System.out.print("enter the digit:");
		num=s.nextInt();
		numsq=num*num;
		while(numsq<0) {
			lastdigit=numsq%10;
			sum=sum+lastdigit;
			numsq=numsq/10;
		}
	
			if(num==num) {
				System.out.println("it is a neon number");
			}
			else {
				System.out.println("not a neon number");
			}
			}
}

