package assignments;
import java.util.Scanner;
public class PalindromeOrNot {

	public static void main(String[] args) {
String string;
Scanner s1=new Scanner(System.in);
System.out.println("enter the string");
string=s1.next();
String reverse=new StringBuffer(string).reverse().toString();
boolean s=string.equalsIgnoreCase(reverse);
if(s==true) {
	System.out.println("palindrome");
}else {
	System.out.println("not palindrome");
}
s1.close();
	}
}