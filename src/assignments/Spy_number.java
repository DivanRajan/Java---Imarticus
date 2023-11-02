package assignments;

import java.util.Scanner;

public class Spy_number {

	public static void main(String[] args) {
		int num,sum,product,split;
		split=0;
		sum=0;
		product=1;
		Scanner s=new Scanner(System.in);
		System.out.print("ENTER THE NUMBER:");
		num=s.nextInt();
		while(num>0);
		split=num%10;
		sum=sum+split;
		product=product*split;
		num=num/10;

	if(sum==product) {
		System.out.print("IT IS A SPY NUMBER:");
	}
	else {
	System.out.print("IT IS NOT A SPY NUMBER:");
	s.close();
	
}
		
	}
}

