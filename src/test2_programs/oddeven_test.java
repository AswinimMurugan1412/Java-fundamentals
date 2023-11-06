package test2_programs;
import java.util.Scanner;
public class oddeven_test {

	public static void main(String[] args) {
		int n;
        Scanner s = new Scanner(System.in);
        System.out.print("enter elements in array : ");
        n= s.nextInt();
        int[] arrNum = new int[n];
        System.out.println("Enter " + n + " elements : ");
        for(int a = 0; a < n; a++) 
        {
            arrNum[a] = s.nextInt();
        }
        // print odd numbers
        System.out.print("Odd numbers : ");
        for(int a = 0 ; a < n ; a++)
        {
            if(arrNum[a] % 2 != 0)
            {
                System.out.print(arrNum[a] + " ");
            }
        }
        System.out.println("");
        // print even numbers
        System.out.print("Even numbers : ");
        for(int a = 0 ; a < n ; a++)
        {
            if(arrNum[a] % 2 == 0)
            {
                System.out.print(arrNum[a] + " ");
            }
	   }
	}
}



