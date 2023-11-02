package Practice;

import java.util.Scanner;

public class Practice_5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("input first number:");
		int num1=s.nextInt();
		System.out.println("input second number:");
		int num2=s.nextInt();
		System.out.println(num1+ "x" +num2+ " = " + num1*num2);
		s.close();

	}

}
