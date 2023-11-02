package program;

import java.util.Scanner;

public class Armstrong_number {

	public static void main(String[] args) {
		int digit =0,num,remainder,result=0,temp;
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		temp=num;
		while (num!=0) {
			digit++;
			num=num/10;
		}
num=temp;
while(num!=0) {
	remainder =  num%10;
	result=(int)(result+Math.pow(remainder, digit));
	num=num/10;
}
if(temp==result) {
	System.out.println("Amstrong number");
}
else {
	System.out.println("Not an amstrong Number");
}
s.close();
	}

}
