package Pattern_Assignment;
import java.util.Scanner;
public class Pattern_3 {

	public static void main(String[] args) {
		int i,j,n,space;
		Scanner x = new Scanner(System.in);
		System.out.print("enter the no of lines");
		n=x.nextInt();
		for(i=1;i<=n;i++) {
			for(space=i;space>1;space--) {
				System.out.print(" ");
			}
		 for(j=n;j>=i;j--) {
			 System.out.print("* ");
			 
		 }
		 System.out.println();
		}
		for(i=1;i<=n;i++) {
			for(space=n;space>i;space--) {
				System.out.print(" ");
			}
		 for(j=1;j<=i;j++) {
			 System.out.print("* ");
			 
		 }
		 System.out.println();
	}

	}

}
