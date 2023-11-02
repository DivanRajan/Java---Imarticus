package Practice;

import java.util.Scanner;

public class Practice_13 {

	public static void main(String[] args) {
		int n,j,i;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		n=s.nextInt();
		for(i=1;i<=n;i++) {
			for(j=n;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		s.close();
	}

}
