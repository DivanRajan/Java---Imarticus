package Variable;

import java.util.Scanner;

public class Perimeter {

	public static void main(String[] args) {
	int length,breadth,height,sum1,result;
	Scanner s=new Scanner(System.in);
	System.out.print("Enter the length:");
	length=s.nextInt();
	System.out.print("Enter the breadth:");
	breadth=s.nextInt();
	System.out.print("Enter the height");
	height=s.nextInt();
	sum1=length+breadth+height;
	result=4*sum1;
	System.out.print(result);

	}
}
