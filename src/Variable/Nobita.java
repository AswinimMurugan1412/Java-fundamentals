package Variable;

import java.util.Scanner;

public class Nobita {
	
	public static void main(String[] args) {
		int result = 0,v1,v2; 
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value 1:");
		v1=s.nextInt();
		System.out.println("enter the value 2:");
		v2 =s.nextInt();
		System.out.println(Math.abs(v1-v2));
		result=v1-v2;
		if (v1<v2| v1>v2){
			System.out.println("the differance is:"+result);
			
		}
		s.close();
		
		}
		
			
			
		

		


	}

