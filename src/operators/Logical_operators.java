package operators;
import java.util.Scanner;
public class Logical_operators {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter A:");
		a=s.nextInt();
		System.out.print("Enter b:");
		b=s.nextInt();
		System.out.print("Enter c:");
		c=s.nextInt();
		if(a>b && a>c) {
			System.out.println("A is greater:");
		
		}
		else if(b>a && b>c) {
			System.out.println("B is greater:");
			
		}
		else {
			System.out.print("c is greater:");
		}
	}

}
