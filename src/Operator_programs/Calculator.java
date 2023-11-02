package Operator_programs;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner reader =new Scanner(System.in);
		System.out.print("Enter two numbers:");
		//nextdouble() reads the next double from the keyboard
		double first=reader.nextDouble();
		double second=reader.nextDouble();
		System.out.print("Enter an operator (+,-,*,/):");
		char operator = reader.next().charAt(0);
		double result=0;
		switch(operator)
		{
		case'+':
			result=first+second;
			break;
		case'-':
			result=first-second;
		case'*':
			result=first*second;
		case'/':
			result=first/second;
			break;
			default:
				System.out.printf("error! operator is not correct");
				System.out.printf("%.1f %c %.1f=%.1f",first,operator,second,result);
		
		}
		
	}

}
