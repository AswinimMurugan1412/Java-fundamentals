package Working_Sheet;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		int n,r,sum=0,temp;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number ");
		n=s.nextInt();
        temp=n;
        while(n>0){  
        r=n%10;
        sum=(sum*10)+r;
        n=n/10;
        }
        if(temp==sum) 
        	System.out.println("it is a palindrome");
        	else 
        		System.out.println("it is not a palindrome");	
        	}
        
	}


