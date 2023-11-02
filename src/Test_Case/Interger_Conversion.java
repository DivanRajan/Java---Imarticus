package Test_Case;

import java.util.Scanner;

public class Interger_Conversion {

	public static void main(String[] args) {
		int a;
		byte b;
		char c;
		float d;

		System.out.println("Enter the integer");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=(byte)a;
		System.out.println("Conversion into byte :"+b);
		c=(char)a;
		System.out.println("Conversion into Char :"+c);
		d=a;
		System.out.println("Conversion into float :"+d);
		s.close();
		

	}

}
