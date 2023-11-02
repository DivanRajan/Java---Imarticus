package Pattern_Assignment;
import java.util.Scanner;
public class Pattern_2 {

	public static void main(String[] args) {
		int i,n,j,space;
		Scanner x = new Scanner(System.in);
		System.out.print("enter the no of lines");
		n=x.nextInt();
		for( i=1;i<=n;i++) {
			for(space=1;space<i;space++) {
				System.out.print(" ");
			}
			for(j=n;j>=i;j--){  
				System.out.print("*");
			}
			System.out.println();
		}
		for( i=1;i<=n;i++) {
			for(space=n;space>i;space--) {
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) {     
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
