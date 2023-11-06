package test2_programs;

import java.util.Scanner;

public class Sum_Average_InArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n,sum=0,avg=0;
		System.out.print("enter the number of elements:");   
        n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) 
       	 arr[i]=s.nextInt();
        for(int i=0;i<n;i++) {
        	sum=sum+arr[i];
        	avg=sum/n;
        	
        }
    	System.out.print(sum);
    	System.out.print(avg);

	}

}
