package Array;

import java.util.Scanner;

public class Testarray_3 {

	public static void main(String[] args) {
		int arr[]= {0,0,0,0,0,};
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the array elements:");
		for(int i=0;i<5;i++) {
		arr[i]=s.nextInt();
		}
		System.out.println("Array elements are:");
		for(int a:arr) {
			System.out.println(a);
			s.close();
		}

	}

}
