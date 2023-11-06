package sorting;

import java.util.Scanner;

public class sorting_minimum {

	public static void main(String[] args) {
		int n,step=0,min_index,i,t = 1;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of array element");
	    n= s. nextInt();
	    int a[]=new int[n];
	    System.out.println("Enter the array element one by one");
	    for(i=0;i<n;i++) {
	    	a[i]=s.nextInt();
	    }
	    for (step=0;step<n-1;step++)
	    {
	    	min_index=step;
			for(i=step+1;i<n;i++)
	    	{
	    		if(a[min_index]>a[i])
	    		{
	    			min_index=i;
	    		}
	    	}
		
	    	t=a[step];
	    	a[step]=a[min_index];
	    	a[min_index]=t;
	    }
	    
	    System.out.println();  
	    
	}
	

}
