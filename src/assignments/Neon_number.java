package assignments;

import java.util.Scanner;

public class Neon_number {

	public static void main(String[] args) {
		int num,square,split,sum;
		Scanner s=new Scanner(System.in);
		System.out.print("ENTER THE NUMBER:");
	    num=s.nextInt();
	    split=0;
	    sum=0;
	    square=num*num;
	    while(square>0) {
	    	split=square%10;
	    	sum=sum+split;
	    	square=square/10;
	    }if(num==sum) {
	    	System.out.print("IT IS NEON NUMBER:");
	    }else {
	    	System.out.print("IT IS NOT A NEON NUMBER:");
	    	s.close();
	    }

	}

}
