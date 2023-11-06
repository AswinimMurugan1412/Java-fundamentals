package Working_Sheet;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int n,i,fact=1;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		n=s.nextInt();
		  for(i=1;i<=n;i++){    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+n+" is: "+fact);    
		 }  
		
		 }

	


