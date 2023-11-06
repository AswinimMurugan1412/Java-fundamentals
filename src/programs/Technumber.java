package programs;

import java.util.Scanner;

public class Technumber {
	public static void main(String[] args) {
        int num,s1,s2,sum,result;
		Scanner s=new Scanner(System.in);
		System.out.print("enter the digit:");
		num=s.nextInt();
		result=0;
		if(num>999 && num<10000) {
			s1=num%100;
			s2=num/100;
			sum=s1+s2;
			result=sum*sum;
			if(num==result) {
				System.out.println("it is a tech number");
			}
			else {
				System.out.println("not a tech number");
			}
			}
		s.close();
		
		}
}


