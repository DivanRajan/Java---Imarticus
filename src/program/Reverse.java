package program;
import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		int num;
		int remainder;
		int result=0;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number:");
		num=s.nextInt();
		while(num!=0) {
		remainder=num%10;
		result=(result*10)+remainder;
		num=num/10;
		}
		System.out.print(result);
	}

}
