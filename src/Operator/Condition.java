package Operator;

import java.util.Scanner;

public class Condition {

	public static void main(String[] args) {
		int num;
		String result;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number:");
		num=s.nextInt();
		result=(num/2==0)?"even numner":"odd number";
		System.out.println(result);
		s.close();
		

	}

}
