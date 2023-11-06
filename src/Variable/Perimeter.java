package Variable;

import java.util.Scanner;

public class Perimeter {

	public static void main(String[] args) {
		int length,breath,height,sum,perimeter;
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the length;");
		length=s1.nextInt();
		System.out.println("enter the breath;");
		breath=s1.nextInt();
		System.out.println("enter the height;");
		height=s1.nextInt();
		sum=length+breath+height;
		perimeter=4*sum;
		System.out.println("perimeter:"+perimeter);


	}

}
