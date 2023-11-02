package Pattern;

import java.util.Scanner;

public class Example_1 {

	public static void main(String[] args) {
		int n,i,j;
		Scanner s = new Scanner (System.in);
		System.out.print("Enter the number of lines:");
		n=s.nextInt();
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
