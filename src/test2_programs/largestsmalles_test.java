package test2_programs;
import java.util.Scanner;
public class largestsmalles_test {

	public static void main(String[] args) { 
		int num,largest,smallest;
		System.out.println("Please enter value of N: "); 
		Scanner sc = new Scanner(System.in); 
		int n = sc.nextInt();
		int largest1 = Integer.MIN_VALUE;
		int smallest1 = Integer.MAX_VALUE; 
		System.out.printf("Please enter %d numbers %n", n); 
		for (int i = 0; i < n; i++)
		{ int num1 = sc.nextInt(); 
		if (num1 > largest1) { largest1 = num1; } 
		if (num1 < smallest1) { smallest = num1; } }
		System.out.println("largest of N number is : " + largest1); 
		System.out.println("smallest of N number is : " + smallest1);

	}

}
