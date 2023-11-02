package Practice;

import java.util.Scanner;

public class Practice_6 {

	public static void main(String[] args) {
		int num1,num2;
		Scanner s=new Scanner(System.in);
		System.out.println("Input First Number");
		num1=s.nextInt();
		System.out.println("input second number");
		num2=s.nextInt();
		System.out.println(num1+"+"+num2+"="+(num1+num2));
		System.out.println(num1+"-"+num2+"="+(num1-num2));
		System.out.println(num1+"x"+num2+"="+(num1*num2));
		System.out.println(num1+"/"+num2+"="+(num1/num2));
		System.out.println(num1+"%"+num2+"="+(num1%num2));
		s.close();
		
		
		
		

	}

}
