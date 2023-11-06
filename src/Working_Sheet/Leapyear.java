package Working_Sheet;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
	     int n;
		Scanner s=new Scanner(System.in);
		System.out.print("enter the year:");
        n=s.nextInt();
        if ((n % 400 == 0)
                || ((n % 4 == 0) && (n % 100 != 0))) {
        
        	  System.out.print("It is a Leap year");	
        }
        else {
        	System.out.print("It is not a Leap year");
	}

}
}