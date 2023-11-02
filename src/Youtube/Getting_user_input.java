package Youtube;

import java.util.Scanner;

public class Getting_user_input {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("enter you name:");
		String name=scn.nextLine();
		System.out.print("enter the dob:");
		int dob=scn.nextInt();
		System.out.print("enter your age:");
		int age=scn.nextInt();
		scn.nextLine();
		System.out.print("enter you place:");
		String place=scn.nextLine();
	}

}
