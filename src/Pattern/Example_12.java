package Pattern;

import java.util.Scanner;

public class Example_12 {

	public static void main(String[] args) {
		int n,i,j,space;
		Scanner s = new Scanner (System.in);
		System.out.print("Enter the number of lines:");
		n=s.nextInt();
		int num=1;
		for(i=1;i<=n;i++) {
			
			for(space=n;space>i;space--) {
				System.out.print("  ");
			}
			for(j=1;j<=i;j++){
					System.out.print(num+"  " );
					num++;
			
			}
			System.out.println();
		}
	}
}
