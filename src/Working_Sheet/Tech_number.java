package Working_Sheet;

import java.util.Scanner;

public class Tech_number {

	public static void main(String[] args) {
		 int num,firsthalf,secondhalf,sum,result,length;
			Scanner s=new Scanner(System.in);
			System.out.print("enter the digit:");
			num=s.nextInt();
			result=0;
			if(num>999 && num<10000) {
				firsthalf=num/100;
				System.out.println("firsthalf="+firsthalf);
				secondhalf=num%100;
				System.out.println("secondhalf="+secondhalf);
				sum=firsthalf+secondhalf;
				result=sum*sum;
				System.out.println("Result=" +result);
				if(num==result) {
					System.out.println("it is a tech number");
				}
				else {
					System.out.println("not a tech number");
				}
				}
			s.close();
	}
 
}
