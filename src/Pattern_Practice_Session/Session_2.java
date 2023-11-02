package Pattern_Practice_Session;
import java.util.Scanner;
public class Session_2 {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=s.nextInt();
	System.out.println("enter another number:");
	int l=s.nextInt();
	System.out.println("what do you want to do:?");
	String sl=s.next();
	switch(sl)
	{
	case"add":
	      System.out.println(n+l);
		break;
	case"sub":
		System.out.println("answer : "+n-l);
		break;
	case"mul":
		System.out.println("answer : "+n*l);
		break;
	case"div":
		System.out.println("answer : "+n/l);
		break;
		default:
	}
s.close();
}
}
