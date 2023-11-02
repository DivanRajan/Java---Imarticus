package Pattern;

import java.util.Scanner;

public class Example_9 {

	public static void main(String[] args) {
		int n,i,j,space;
		Scanner s = new Scanner (System.in);
		System.out.print("Enter the number of lines:");
		n=s.nextInt();
		for(i=1;i<=n;i++) {
		if (i==n){
			for(j=n;j>=1;j--) {
				System.out.print("* ");
			}
		}
		else {
			for(space=n;space>i;space--) {
				System.out.print(" ");
			}
			for(j=n;j>=1;j--){
					System.out.print("* ");
			}
			}
			System.out.println();
		}
	}
}
