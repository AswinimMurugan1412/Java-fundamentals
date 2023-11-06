package programs;

import java.util.Scanner;

public class PetersonNumber {

	public static void main(String[] args) {
	        int fact,pnum,sum=0,result;
			Scanner s=new Scanner(System.in);
			System.out.print("enter the digit:");
			pnum=s.nextInt();
			for (int temp= pnum;temp>0; temp=temp/10) {
				fact=1;
				result=temp%10;
				for(int i=1;i<=result;i++) {
					fact=fact*i;
				}
				sum=sum+fact;
				}
				if(sum==pnum) {
					System.out.println("it is a peterson number");
				}
				else {
					System.out.println("not a peterson number");
				}

	}

}
