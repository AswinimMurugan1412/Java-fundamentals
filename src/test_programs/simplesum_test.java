package test_programs;

import java.util.Scanner;

public class simplesum_test {

	public static void main(String[] args) {
        int a,b,c,sum;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number: ");
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        sum=a+b+c;
        System.out.println("result=" +sum );

	}

}
