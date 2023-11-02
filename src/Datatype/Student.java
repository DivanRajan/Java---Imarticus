package Datatype;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		int studId;
		String name;
		float mark1;
		float mark2;
		float mark3;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Roll No: ");
		int rollno = s.nextInt();
		System.out.print("Enter the name : ");
		name =s.next();
		System.out.print("Enter the Contact: ");
		long contact = s.nextLong();
		System.out.print("Enter the Gender: ");
		char gender = s.next().charAt(0);
		System.out.print("Enter the Age: ");
		int age = s.nextInt();
		System.out.println("Student Information: ");
		System.out.println("Roll No: "+rollno);
		System.out.println("Name: "+name);
		System.out.println("Contact: "+contact);
		System.out.println("Gender:"+gender);
		System.out.println("Age:"+age);
	}

}
