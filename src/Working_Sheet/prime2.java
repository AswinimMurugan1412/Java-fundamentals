package Working_Sheet;

import java.util.Scanner;

public class prime2 {

	public static void main(String[] args) {
      int i, number, count; 
		Scanner s=new Scanner(System.in);
		System.out.print("enter the number:");
		number=s.nextInt();
	
		{
			count = 0;
		    for (i = 2; i <= number/2; i++)
		    {
		    	if(number % i == 0)
		    	{
		    		count++;
		    		break;
		    	}
		    }
		    if(count == 0 && number != 1 )
		    {
		    	System.out.print(number + " ");
		    }  
		}
		
		
		
		
		
		
		System.out.print("enter the number:");
		num=s.nextInt();
		
		for(flag=1; flag<=num; flag++)
			flag=num;
		{
			count=0;
		for (i=2;i<=num%2;i++) {	
		if(num%i==0);
		{
			count ++;
		break;
		}
		}
		if (count==0&&num!=1);
		System.out.print("The Prime Number of first"+num+i);
		}
	}
	
}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	

	}

}
