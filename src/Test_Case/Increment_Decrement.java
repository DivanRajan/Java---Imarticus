package Test_Case;

import java.util.Scanner;

public class Increment_Decrement {

	public static void main(String[] args) {
		int a,b,c,d,e;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter any interger a:");
		a=s.nextInt();
		b=++a;
		System.out.println("result after pre increment a:"+a);
		System.out.println("result after pre increment b"+b);
		c=a++;
		System.out.println("result after pre increment a:"+a);
		System.out.println("result after post increment c:"+c);
		d=--a;
		System.out.println("result after pre increment a:"+a);
		System.out.println("result after pre increment d:"+d);
		e=a--;
		System.out.println("result after pre increment a:"+a);
		System.out.println("result after pre increment e:"+e);

	}

}
