package program;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		int num;
		int remainder;
		int result=0;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number:");
		num=s.nextInt();
		int n=num;
		while(n!=0) {
		remainder=n%10;
		result=(result*10)+remainder;
		n=n/10;
		}
		if(num==result) {
			System.out.println("it is palindrome");
		}
		else {
			System.out.println("it is not a palindrome");
		}
		s.close();
	}

}
