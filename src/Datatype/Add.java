package Datatype;

import java.util.Scanner;

public class Add {

	public static void main(String[] args) {
        int num1,num2,result;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        num1=s.nextInt();
        System.out.print("Enter the Second number: ");
        num2=s.nextInt();
        result=num1+num2;
		System.out.println("Adding two numbers: "+result);

	}
   
}
