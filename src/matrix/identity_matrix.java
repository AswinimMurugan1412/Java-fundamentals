package matrix;
import java.util.Scanner;
public class identity_matrix {

	public static void main(String[] args) {
		int r,c,flag=0;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the row: ");
		r=s.nextInt();
		System.out.print("Enter the coloum: ");
		c=s.nextInt();
		int a[][]={{1,0,0},     //{{1,0,0},
			       {0,1,0},     //{0,1,0},
			       {0,1,1}};     //{0,0,1};
			for (int i=0;i<r;i++) {
				for(int j=0;j<c;j++) {
					if(a[i][j]!=1 && a[j][i]!=0) {
						flag=1;
					}
				}
			}
			if(flag==0) {
				System.out.println("identity matrix");
			}
			else {
				System.out.println("not an identity matrix");
						
					}
				}
}
