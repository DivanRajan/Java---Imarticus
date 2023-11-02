package Pattern;

import java.util.Scanner;

public class Example_6 {

	public static void main(String[] args) {
		int n,i,j,space;
		Scanner s = new Scanner (System.in);
		System.out.print("Enter the number of lines:");
		n=s.nextInt();
		
		for(i=1;i<=n;i++) {
			if(i<=n/2) {
				for(space=n;space>i;space--) {
					System.out.print(" ");
				}
				for(j=1;j<=i;j++) {
					if(j==1||j==i) {
						System.out.print("* ");
					}
					else {
						System.out.print("  ");
					}
				}
			}
			else {
				for(space=1;space<i;space++) {
					System.out.print(" ");
				}
				for(j=n;j>=i;j--) {
					if(j==n||j==i) {
						System.out.print("* ");
					}
					else {
						System.out.print("  ");
					}
				}
			}
			System.out.println();
		}
	}
}