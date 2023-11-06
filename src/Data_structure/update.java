package Data_structure;
import java.util.Scanner;
public class update {

	public static void main(String[] args) {
						int pos,j,n,element;
						Scanner s=new Scanner(System.in);
						System.out.println("Enter the number of element: " );
						n=s.nextInt();
						int arr[]= new int[n+1];
						System.out.print("\nEnter the array element: ");
						for (int i=0;i<n;i++) {
							arr[i]=s.nextInt();
						}
								
						        System.out.print("\nupdate index");
						        pos=s.nextInt();
						        System.out.print("\nupdate element");
						        element=s.nextInt();
						       
						        System.out.print("Original Array: ");
						        for (int i=0;i<n;i++) {
						        	System.out.print(arr[i]+" ");
						        }
						        System.out.println();
						       arr[pos-1]=element;
						        System.out.println("update Array: ");
						        for(int i=0;i<n;i++) {
						        	System.out.print(arr[i]+" ");
						        
				         		        }

				}
				



			


	}


