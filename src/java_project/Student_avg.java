package java_project;

import java.util.Scanner;

public class Student_avg {
	public static void main(String[] args) {
	int studId,mark1,mark2,mark3;
	String studname;
	float avg,total;
	Scanner s = new Scanner(System.in);
	System.out.print("Enter the StudId: ");
	studId = s.nextInt();
	System.out.print("Enter the Name: ");
	studname = s.next();
	System.out.print("Enter the Mark1: ");
	mark1 = s.nextInt();
	System.out.print("Enter the Mark2: ");
	mark2 = s.nextInt();
	System.out.print("Enter the Mark3: ");
	mark3 = s.nextInt();
	total = mark1+mark2+mark3;
	avg = total/3;
	if(avg>90) {
		System.out.print("excellent:");
	}
	else if(avg>80) {
		System.out.print("very good:");
		
	}
	else if(avg>70) {
		System.out.print("goog:");
		
	}
	else if (avg>60) {
		System.out.print("workhard:");
	}
	else {
		System.out.print("poor:");
	}
}

}

