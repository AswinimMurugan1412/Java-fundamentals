package test2_programs;
import java.util.Scanner;
public class square_rect_circle {

	public static void main(String[] args) {
		double width, height, Area,radius=0; 
		Scanner s = new Scanner(System.in);
		
		System.out.println(" Please Enter the Width of a Rectangle =  ");
		width = s.nextDouble();
		System.out.println(" Please Enter the Height of a Rectangle = ");
		height = s.nextDouble();
		Area = width * height;
		System.out.format(" The Area of a Rectangle = %.2f\n",Area);
		

		System.out.println(" Please Enter the Width of a squre =  ");
		width = s.nextDouble();
		System.out.println(" Please Enter the Height of a squre = ");
		height = s.nextDouble();
		Area = (2* Math.PI* radius);
		System.out.format(" The Area of a squre = %.2f\n",Area);
		

  
	   System.out.println(" Please Enter the Width of a circle =  ");
	   width = s.nextDouble();
	   System.out.println(" Please Enter the Height of a circle = ");
	   height = s.nextDouble();
	   Area = (Math.PI* radius*radius);

	  System.out.format(" The Area of a circle = %.2f\n",Area);
	
}
}

		
	

	
