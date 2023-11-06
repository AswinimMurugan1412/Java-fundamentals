package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class test_array {

	public static void main(String[] args) {
		int[] intArray= {1,2,3,4,5};
		String intArrayString=Arrays.toString(intArray);
		System.out.println(intArray);
		for(int val:intArray) {
			System.out.print(val+",");
		}
		System.out.println("\n"+intArrayString);
		}
	}


