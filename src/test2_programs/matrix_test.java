package test2_programs;

import java.util.Scanner;

public class matrix_test {

	public static void main(String[] args) {
       int i, j;	
		
		int[][] org_arr = {{1,2,3}, 
				{5,5,5}, 
				{7, 8,9}};
		int[][] trans_arr = new int[3][3];
		

		for(i = 0; i < org_arr.length ; i++)
		{
			for(j = 0; j < org_arr[0].length; j++)
			{
				trans_arr[j][i] = org_arr[i][j];
			}
		}
		
		System.out.println("\nOriginal Items are :");
		for(i = 0; i < org_arr.length ; i++)
		{
			for(j = 0; j < org_arr[0].length; j++)
			{
				System.out.format("%d \t", org_arr[i][j]);
			}
			System.out.print("\n");
		}
		
		System.out.println("\nAfter Transposing Items are :");
		for(i = 0; i < trans_arr.length ; i++)
		{
			for(j = 0; j < trans_arr[0].length; j++)
			{
				System.out.format("%d \t", trans_arr[i][j]);
			}
			System.out.print("\n");
		}
	}

	}


