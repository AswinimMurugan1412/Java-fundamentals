package test_programs;

import java.util.Scanner;
                                                        //a=4,b=3...=1    //a=4,b=6...=0
public class pokemon_test {

	public static void main(String[] args) {
		 int a,b;
			Scanner s1=new Scanner(System.in);
			System.out.print("Enter the pokemon a ");
			 a=s1.nextInt();
			 System.out.print("Enter the pokemon b ");
		     b=s1.nextInt();
		     if(a>=1 && b<=8) {
		    	 if(a>b) {
		    		 System.out.print("1");
		    	 }
		    	 else {
		    		 System.out.print("o");
		    		 
		    	 }
		     }
		     else{
		    	 System.out.println("invalid number");
		    	 
		     }

	}

}
