package test_programs;

import java.util.Scanner;
                                                    // 6, 20=3      //8,5=-1
public class charity_test {

	public static void main(String[] args) {
		 int m,n,split=0;
			Scanner s1=new Scanner(System.in);
			System.out.print("Enter the n pepole ");
			 n=s1.nextInt();
			 System.out.print("Enter the m cloths ");
		     m=s1.nextInt();
		     if(m>=1 && n<=1000) {
		    	 if(m>n) {
		    		 split=m/n;
					 System.out.println(split);
		    	 }
		    	 else {
					 System.out.println("-1");
		    	 }
		     }
	
		    	 
		    	 else {
					 System.out.print("invalid");
		    	 }
	}
}
		    	
		    	 
	
	


