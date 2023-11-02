package Test_Case;

import java.util.Scanner;

public class Test_Case_1 {
		public static void main(String[] args) {
			int a,n,count=0;
			String x="";
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the Decimal number:");
			n=s.nextInt();
			while(n>0)
			{
			    a=n%10;
			    a=a+1;
				x=a+x;
				n=n/10;
				}
			System.out.println("number after increment:"+x);
			s.close();
		}

	}

