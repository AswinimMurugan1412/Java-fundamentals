package test2_programs;
import java.util.Scanner;

public class covert_longvaluetobyte {

	public static void main(String[] args) {
		long a;
		byte b;
		Scanner s=new Scanner(System.in);
           System.out.println("enter any long value:");
           a=s.nextInt();
           b=(byte) a;
           System.out.println("conversion into byte:"+b);           
	}

}
