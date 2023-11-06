package Data_structure;
import java.util.Scanner;
public class search {

	public static void main(String[] args) {
		int flag=0,n,search;
								Scanner s=new Scanner(System.in);
								System.out.println("Enter the number of element: " );
								n=s.nextInt();
								int arr[]= new int[n+1];
								System.out.print("\nEnter the array element: ");
								for (int i=0;i<n;i++) {
									arr[i]=s.nextInt();
								}
								System.out.print("\nsearch element");	
								 for (int i=0;i<n;i++) {
									 search=s.nextInt();  
								      
								       
								        System.out.print("enter the search element: ");
								     
								        for (int i1=0;i1<n;i1++) {
								        	System.out.print(arr[i1]+" ");
								        }
								        for (int i1=0;i1<n;i1++) {
								        	if(arr[i1]==search)
								        	System.out.print("search element is at the position" + (i1+1));
								        	flag=1;
								        }
								        if(flag==0) {
								        	System.out.println("The element searched is not there");
								        	
								        
								        }
								       
								 }
	}
}

						
						



					


			




	
