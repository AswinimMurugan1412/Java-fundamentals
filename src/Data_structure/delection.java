package Data_structure;
import java.util.Scanner;

public class delection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int pos,j,n;
				Scanner s=new Scanner(System.in);
				System.out.println("Enter the number of element: " );
				n=s.nextInt();
				int arr[]= new int[n+1];
				System.out.print("\nEnter the array element: ");
				for (int i=0;i<n;i++) {
					arr[i]=s.nextInt();
				}
						
				        System.out.print("\ndelete index");
				        pos=s.nextInt();
				        j=pos;
				        System.out.print("Original Array: ");
				        for (int i=0;i<n;i++) {
				        	System.out.print(arr[i]+" ");
				        }
				        System.out.println();
				        System.out.println("j= "+j);
				        while(j<n) {
				        	arr[j-1]=arr[j];
				        	j++;
				        }
				       n=n-1;
				        System.out.println("deleted Array: ");
				        for(int i=0;i<n;i++) {
				        	System.out.print(arr[i]+" ");
				        
		         		        }

		}
		



	}

