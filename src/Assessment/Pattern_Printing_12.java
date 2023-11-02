package Assessment;

import java.util.Scanner;

public class Pattern_Printing_12 {

	public static void main(String[] args) {
		int n,i,j;
		Scanner s= new Scanner(System.in);
		System.out.println("ENTER THE NUMBER OF LINES:");
		n=s.nextInt();
		for (i=1;i<=n;i++) {
			for (j=1;j<=i;j++) {
			System.out.print(j);
		}
		System.out.println();
		}
	}
	}