package Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayList2 {

	public static void main(String[] args) {
		ArrayList<String>arr=new ArrayList<String>();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n=s.nextInt();
		/* arr.add("Steve");
		arr.add("Tim");
		arr.add("Lucy");
		arr.add("Pat");
		arr.add("Angela");
		arr.add("Tom");*/
		/*System.out.println("Enter the array elements one by one: ");
		for(int i=0;i<n;i++) {
			arr.add(s.next());
		}*/
		arr.set(2, "Malathy");      // set=update or add new name
		System.out.println("ArrayList: ");
		System.out.println(arr);
		Collections.sort(arr);
		System.out.println("ArrayList using for each: ");
		for (String str1:arr) {
			System.out.println(str1);
		}
		System.out.println(arr.get(2));    //
		System.out.print(arr.indexOf("Malathy"));
		System.out.println(arr.contains("Tom"));
		arr.clear();
		System.out.println(arr);
		}

	}


