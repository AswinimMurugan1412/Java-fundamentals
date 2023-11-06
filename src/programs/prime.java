package programs;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
    int num, notprime=0;
    Scanner s=new Scanner(System.in);
    System.out.print("Enter the number:");
    num=s.nextInt();
    for(int i=2;i<=num;i++){
    if (num%i==0) {
    	notprime=1;
    	break;
    }
    }
    
    if(notprime==1)
    System.out.println("not a Prime number");
    else
    	System.out.println("prime number");
	}
    	
	 
	}
	
    





