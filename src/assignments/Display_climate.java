package assignments;

import java.util.Scanner;

public class Display_climate {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter month number:");
		Scanner r=new Scanner(System.in);
		n=r.nextInt();
		if(n==1||n==2||n==3||n==4)
		{
			System.out.print("Summer:");	
		}
		else if(n==5||n==6||n==7||n==8)
		{
			System.out.print("Rainy:");
		}
		else if(n==9||n==10||n==11||n==12)
		{
			System.out.print("Winter:");
		}
		}


	}

