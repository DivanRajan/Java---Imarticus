package Practice;

import java.util.Scanner;

public class Practice_11 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String[] n=new String[5];
		System.out.println("enter 5 doctors name");
		for(int i=0;i<5;i++) {
			n[i]=s.next();
		}
		
		System.out.println("enter the day");
		String day=s.next();
		
		 if (monday==n[[0]) {
			System.out.println(n[0]);
		}
		else if (day=="tuesday") {
			System.out.println(n[1]);
		}
		else if (day=="wednesday"){
				System.out.println(n[2]);
		}
		else if (day=="thursday") {
			System.out.println(n[3]);
		}
		else if (day=="friday") {
			System.out.println(n[4]);	
		}
		
	}

}
