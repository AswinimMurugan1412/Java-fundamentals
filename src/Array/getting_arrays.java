package Array;

import java.util.Scanner;

public class getting_arrays {

	public static void main(String[] args) {
		int arr[]= {0,0,0,0,0};
		Scanner s= new Scanner(System.in);
		System.out.println("enter the array element:");
		for(int i=0;i<5;i++) {
			arr[i]=s.nextInt();
		}
		System.out.print("array elements are:");
		for (int a:arr) {
			System.out.println(a);
			
		}

	}

}
