package Pattern;
import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		int n,i,j;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number of lines: ");
        n=s.nextInt();
        for(i=1;i<=n;i++) {            //for invert 
        for(j=n;j<=i;j--) {           //j=n;j<=i;j--
        	System.out.print("*");
        }
        System.out.println();
        }
	}

}
