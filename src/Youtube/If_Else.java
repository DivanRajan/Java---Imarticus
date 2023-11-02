package Youtube;

import java.util.Scanner;

public class If_Else {

	public static void main(String[] args) {
		int mark;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the mark(0-100)");
		mark=s.nextInt();
		if (mark>=80) {
			System.out.println("grade a");
		}
		else if(mark>=70) {
				System.out.println("grade b");
			}
		else if(mark>=60) {
			System.out.println("grade c");
		}
		else if(mark>=50) {
			System.out.println("grade d");
		}
		else if(mark>=40) {
			System.out.println("grade e");
		}
			else {
				System.out.println("grade f");
			}
			
			
		}
	}
 
