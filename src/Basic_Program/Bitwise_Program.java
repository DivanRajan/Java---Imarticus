package Basic_Program;
import java.util.Scanner;
public class Bitwise_Program {
	//question no 1)multiply given number by 4 using bitwise Operator

	public static void main(String[] args) {
		int n,mul;
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the number : ");
		n=s.nextInt();
		mul=n<<2;//explanation:4X2=8,8X2=16 multiply by 2 X	 2
		System.out.println("Answer"+mul);
		s.close();
	}

}
