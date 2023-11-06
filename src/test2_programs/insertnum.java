package test2_programs;

import java.util.Scanner;

public class insertnum {

	public static void main(String[] args) {
		int ins_else,len,j,ind,n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of element: " );
		n=s.nextInt();
		int arr[]= new int[n+1];
		System.out.print("\nEnter the array element: ");
		for (int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
				System.out.print("Insert Element");
		        ins_else=s.nextInt();
		        System.out.print("\nInsert index");
		        ind=s.nextInt();
		        j=n-1;
		        System.out.print("Original Array: ");
		        for (int i=0;i<=n;i++) {
		        	System.out.print(arr[i]+" ");
		        }
		        System.out.println();
		        n=n+1;
		        while(j>=ind) {
		        	arr[j+1]=arr[j];
		        	j--;

	}

}
}