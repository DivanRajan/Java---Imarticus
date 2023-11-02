package Control_flow;
import java.util.Scanner;
public class Even_Odd {

	public static void main(String[] args) {
	int num1;
	Scanner s1=new Scanner(System.in);
	System.out.print("Enter the Number: ");
	num1=s1.nextInt();
	if(num1>0) {
		System.out.println("Positive Number: "+num1);
	}
	else if (num1==0) {
		System.out.println("zero");
	}
	else {
		System.out.println("Negative Number: "+num1);
	}
	
	}

}
