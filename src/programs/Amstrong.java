package programs;


import java.util.Scanner;

public class Amstrong {//153,1634,1,2,3,4,5,6,7,8,9,370,371,54748
	

	public static void main(String[] args) {
		int digit=0,num,remainder,result = 0,temp;
		Scanner s=new Scanner(System.in);
		System.out.print("enter the number:");
		num=s.nextInt();
		temp=num;
		while(num!=0) {
			digit++;
			num=num/10;
		}
		num=temp;
		while(num!=0) {
			remainder=num%10;
			result=(int)(result+Math.pow(remainder, digit));
			num=num/10;
		}
		if(temp==result) {
			System.out.println("amstrong number");
		}
		else {
			System.out.println("Not an amstrong number");
		}
		s.close();
			
		}

	}


