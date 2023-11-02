package assignments;

import java.util.Scanner;

public class Tech_number {

	public static void main(String[] args) {
		int num,split1,split2,sum,result;
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER THE FOUR DIGIT NUMBER:");
		num=s.nextInt();
		if(num>999 && num<10000) {
			split1=num%100;
			split2=num/100;
			sum=split1+split2;
			result=sum*sum;
			if(num==result) {
				System.out.println("IT IS TECH NUMBER:");
			}else {
				System.out.println("IT IS NOT A TECH NUMBER:");
			}
		}else {
			System.out.print("enter valid number:");
			s.close();
			}
		}
	}

 