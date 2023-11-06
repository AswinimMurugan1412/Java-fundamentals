package Working_Sheet;
import java.util.Scanner;
public class PrimeNumber {
	public static void main(String[] args) {
		int n,m,i,flag=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the numbers");
		n=s.nextInt();
        m=n%2;
        if(n==0 || n==1) {
        	System.out.println("It is not a prime number");	
        }
        for(i=2;i<=n;i++){      
            if(n%i==0){  
            System.out.println("It is not a prime number");
           flag=1;
           break;
            }
        }
           if (flag==0) {
        	   System.out.println("It is a prime number"); 
           }
            		
            	}
}
