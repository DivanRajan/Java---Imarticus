package Rege_Ex;
import java.util.regex.*;
public class Regex_5 {

	public static void main(String[] args) {
	System.out.println("metacharacters d....");//d means digit
System.out.println(Pattern.matches("\\d","abc"));//false(non-digit)
System.out.println(Pattern.matches("\\d","1"));//true(digit and comes once
System.out.println(Pattern.matches("\\d","4443"));
//false(digit but comes more than once)
System.out.println(Pattern.matches("\\d","323abc"));//false(digit and char)"
		System.out.println("metacharacters D....");
		System.out.println(Pattern.matches("\\D", "abc"));
		System.out.println(Pattern.matches("\\D", "1"));
		System.out.println(Pattern.matches("\\D", "4443"));
		System.out.println(Pattern.matches("\\D", "323abc"));
		System.out.println(Pattern.matches("\\D", "m"));
		System.out.println("metacharacter");
	}

}
