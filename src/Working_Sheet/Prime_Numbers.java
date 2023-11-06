package Working_Sheet;

import java.util.Scanner;

public class Prime_Numbers {

	public static void main(String[] args) {
		int count;
		Scanner s=new Scanner(System.in);
		System.out.print("enter the number:");
        int n= s.nextInt();
       System.out.println("Prime Numbers from 1 to " +n);
       for(int i=2; i<=n; i++)
        {
    	   count=0;
        for(int j=2; j<i; j++)
       {
        if(i%j==0)
        {
         count++;
         break;
        }
        }
   if(count==0)
      System.out.println(i);
      }
      }
      }