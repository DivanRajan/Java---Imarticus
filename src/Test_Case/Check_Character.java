package Test_Case;

import java.util.Scanner;

public class Check_Character {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any alphapet");
		char m =s.next().charAt(0);
		if(m>=97 && m<=123)
		{
			System.out.println("Lower Case");
			
		}
		else if(m>=65 && m<=96)
		{
			System.out.println("upper case");
		}
		else if(m>=48 && m<=57)

	{
		System.out.println("Digit");	
		}
		s.close();
	}

}
