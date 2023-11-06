package Oops;

public class recursion_function {
	
	static int num=1;
	static void p(){
		if(num<=5) {
		System.out.println("hello");
		}
		num++;
		p();
	}

	public static void main(String[] args) {
		p();

	}

}
