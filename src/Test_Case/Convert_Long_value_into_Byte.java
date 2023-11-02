package Test_Case;

import java.util.Scanner;

public class Convert_Long_value_into_Byte {

	public static void main(String[] args) {
		long a;
		byte b;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Any Long Value:");
		a=s.nextLong();
		b=(byte)a;
		System.out.println("Conversion into Byte"+b);
		s.close();

	}

}
