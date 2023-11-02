package operators;
import java.util.Scanner;
public class Conditional_operator {

	public static void main(String[] args) {
		int num;
		String result;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number:");
        num=s.nextInt();
        result=(num%2==0)?"Even numer":"Odd number";
        System.out.println(result);
        s.close();
	}

}
