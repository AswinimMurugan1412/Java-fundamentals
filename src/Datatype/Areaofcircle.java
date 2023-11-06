package Datatype;

import java.util.Scanner;

public class Areaofcircle {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		float radius, area,perimeter;//double also used when more decimal need
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the radius of circle: ");
		radius= scanner.nextFloat();
		area = (float) (Math.PI* radius*radius);
		System.out.print("Enter the radius of rectangle: ");
		radius= scanner.nextFloat();
		area = (float) (Math.PI* radius*radius);//pi=3.5 (double)
		System.out.print("Enter the radius of square: ");
		radius= scanner.nextFloat();
		area = (float) (Math.PI* radius*radius);//pi=3.5 (double)
				
				System.out.println(" Area="+area);
		        

	}

}
