package Working_Sheet;

import java.util.Scanner;

public class VowelsAndConstant {

	public static void main(String[] args) {
		String v="a,e,i,o,u,A,E,I,O,U";
		Scanner s=new Scanner(System.in);
		System.out.print("enter the aplphabet:");
		v=s.next();
        if (v == "a" || v == "e" || v == "i" || v == "o"
                || v== "u" || v == "A" || v == "E" || v == "I" || v == "O"
                || v== "U")
                System.out.println("It is a Vowel.");
	
           else {
                System.out.println("It is a Consonant.");
        }
        
	
}

}
