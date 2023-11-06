package Working_Sheet;

import java.util.Scanner;

public class PerimeterOfRectangle {

	public static void main(String[] args) {
		int perimeter,length,breath,m;
			Scanner s=new Scanner(System.in);
			System.out.print("enter the length:");
	        length=s.nextInt();
	        System.out.print("enter the breath:");
	        breath=s.nextInt();
	        m=length+breath;
            perimeter=2*m;
            System.out.println("The perimeter of given +lenth and +breath= "+perimeter);
	}

}
