package Array;

import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9 };
		int rot,x;
		Scanner s= new Scanner(System.in);
		System.out.print("number of rotation: ");
		rot=s.nextInt();
		int n=arr.length;
		for(int r=1;r<=rot;r++) {
		x=arr[n-1];
        for(int i=n-2;i>=0;i--) {
        	arr[i+1]=arr[i];
        }
        arr[0]=x;
        System.out.println("Rotatd Array:");
        for(int array:arr) {
        	System.out.print(array+" ");

        	s.close();
        	
        }
	}

}

}
