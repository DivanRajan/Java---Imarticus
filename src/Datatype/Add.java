package Datatype;

import java.util.Scanner;

public class Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=10,num2=20,result;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the First Number: ");
		num1=s.nextInt();
		System.out.print("Enter the Second Number: ");
		num2=s.nextInt();
		result = num1+num2;
		System.out.println("Adding two numbers:"+result);
	}

}
