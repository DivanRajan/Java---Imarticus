package SkillenzaAssesment;

import java.util.Scanner;

public class MathLip {

	public static void main(String[] args) {
		double d1;
		double d2;
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the number : ");
		d1=s.nextDouble();
		System.out.println("Enter the number : ");
		d2=s.nextDouble();
		System.out.println("ceiling of"+d1+"="+Math.ceil(d1));
		System.out.println("Floor of"+d1+"="+Math.floor(d1));
		System.out.println("ceiling of"+d2+"="+Math.ceil(d2));
		System.out.println("Floor of"+d2+"="+Math.floor(d2));
		s.close();
	}

}
