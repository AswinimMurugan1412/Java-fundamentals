package test_2prg;
import java.util.Scanner;
public class convert_inttobyte {

	public static void main(String[] args) {
		int a;
		int b;
		char c;
		float d;
		Scanner s=new Scanner(System.in);
		System.out.println("enter any integer:");
		a=s.nextInt();
		b=(byte)a;
		System.out.println("conversion into byte:"+b);
		c=(char)a;
		System.out.println("conversion into char:"+c);
		d=a;
		System.out.println("conversion into float:"+d);
		

	}

}
