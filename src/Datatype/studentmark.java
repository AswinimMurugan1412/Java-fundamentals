package Datatype;
import java.util.Scanner;
public class studentmark {
	
	public static void main(String[] args) {
		int ID;
		String Name;
		float mark1,mark2,mark3;
		try (Scanner s = new Scanner (System.in)){
		
		System.out.println("Enter the ID: ");
	    ID= s.nextInt();
	    System.out.println("Enter the Name: ");
	    Name= s.next();
	    System.out.println("Enter the mark1");
	    mark1= s. nextFloat();
	    System.out.println("Enter the mark2");
	    mark2= s. nextFloat();
	    System.out.println("Enter the mark3");
	    mark3= s. nextFloat();    
	   
}


        System.out.println("ID: "+ID);
        System.out.println("NAME: "+Name);
        System.out.println("MARK1: "+mark1);
        System.out.println("MARK2: "+mark2);
        System.out.println("MARK3: "+mark3);
}
}

