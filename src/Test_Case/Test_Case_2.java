package Test_Case;

import java.util.Scanner;

public class Test_Case_2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER THEDAYS");
		int n=s.nextInt();
		int years;
		int weeks;
		int days;
		years=n/365;
		n=n%365;
		weeks=n/7;
		days=n%7;
		System.out.println("Years : "+years);
		System.out.println("Weeks : "+weeks);
		System.out.println("Days : "+days);
		s.close();
	}
	

}
