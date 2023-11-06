package test_programs;
import java.util.Scanner;

public class digt_num {

	public static void main(String[] args) {
		int n,split=0,result,remainder;
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the number: ");
		n=s1.nextInt();
		result=0;
		while(n>0) {
			remainder=n%10;
			result=result*10+remainder;
			n=n/10;
		}
		while(result>0) {
			split=result%10;
			if(split==0) {
				System.out.print("zero ");
			}
			if(split==1) {
				System.out.print("one ");
			}
			if(split==2) {
				System.out.print("two ");
			}
			if(split==3) {
				System.out.print("three ");
			}
			if(split==4) {
				System.out.print("four ");
			}
			if(split==5) {
				System.out.print("five ");
			}
			if(split==6) {
				System.out.print("six ");
			}
			if(split==7) {
				System.out.print("seven ");
			}
			if(split==8) {
				System.out.print("eight ");
			}
			if (split==9){
				System.out.print("nine ");
			}result=result/10;
		}

	}

}
