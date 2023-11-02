package Datatype;
import java.util.Scanner;
public class Stud_info {

	public static void main(String[] args) {
		int studId;
		String studname;
		float mark1;
		float mark2;
		float mark3;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the StudId: ");
		studId = s.nextInt();
		System.out.print("Enter the Name: ");
		studname = s.next();
		System.out.print("Enter the Mark1: ");
		mark1 = s.nextFloat();
		System.out.print("Enter the Mark2: ");
		mark2 = s.nextFloat();
		System.out.print("Enter the Mark3: ");
		mark3 = s.nextFloat();
		float total;
		total = mark1+mark2+mark3;
		float avg;
		avg = total/3;
		System.out.println("Student Information: ");
		System.out.println("StudId: "+studId);
		System.out.println("Student Name: "+studname);
		System.out.println("Mark1: "+mark1);
		System.out.println("Mark2:"+mark2);
		System.out.println("Mark3:"+mark3);
		System.out.println("Total:"+total);
		System.out.println("Average:"+avg);
	}

}
