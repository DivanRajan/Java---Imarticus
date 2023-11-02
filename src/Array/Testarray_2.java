package Array;

import java.util.Arrays;

public class Testarray_2 {

	public static void main(String[] args) {
	int[] intArray = { 1, 2, 3, 4, 5 };
	String intArrayString = Arrays.toString(intArray);
	System.out.println(intArray);
	for (int val:intArray) {
		System.out.println(val+",");
		
	}
	System.out.println("\n"+intArrayString);
	

	}

}
