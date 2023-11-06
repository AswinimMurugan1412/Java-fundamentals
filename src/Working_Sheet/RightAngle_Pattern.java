package Working_Sheet;

import java.util.Scanner;

public class RightAngle_Pattern {

	public static void main(String[] args) {
		int n,i,j;
		Scanner s=new Scanner(System.in);
		System.out.print("enter the length:");
        n=s.nextInt();
        for(i=0;i<n;i++) {
        	for (j = 0; j <= i; j++){
        		System.out.print(" * ");		
        }
        	System.out.println();
	}
	}
}
