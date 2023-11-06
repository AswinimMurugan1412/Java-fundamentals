package matrix;

public class addition {

	public static void main(String[] args) {
		int r=2,c=2,result=0;
		int a[] []= {{1,2},
		            {3,4}};
		int b[][]= {{10,20},
				   {30,40}};
		int result1[][]=new int[2][2];
		System.out.println("A matrix");
		for (int i=0;i<r;i++)
		{
		for (int j=0;j<c;j++)
		{
			result1[i][j]=a[i][j]+b[i][j];
		    System.out.println(" the matrix is "+ [i][j]);
		}
		}
	}
}
		
	


