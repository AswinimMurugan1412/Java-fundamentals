package test2_programs;

import java.util.Scanner;

public class pre_and_post_increment_decrement {

	public static void main(String[] args) {
		int a,b,c,d,e;
		  Scanner s=new Scanner(System.in);
		    System.out.println("enter any integer a:");
		    a=s.nextInt();
		    b=++a;
		    System.out.println("result after pre increment a:"+a);
		    System.out.println("result after pre increment b:"+b);
		    c=a++;
		    System.out.println("result after pre increment a:"+a);
		    System.out.println("result after pre increment c:"+c);
		    d=--a;
		    System.out.println("result after pre increment a:"+a);
		    System.out.println("result after pre decrement d:"+d);
		    e=a--;
		    System.out.println("result after pre inc rement a:"+a);
		    System.out.println("result after pre increment e:"+e);

	}

}
