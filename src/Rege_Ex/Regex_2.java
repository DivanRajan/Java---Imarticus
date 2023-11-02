package Rege_Ex;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string");
		String str1=s.nextLine();
		Pattern pattern=Pattern.compile("javaTraining",
				Pattern.CASE_INSENSITIVE);
		Matcher matcher=pattern.matcher(str1);
		boolean matchFound=matcher.find();
		if(matchFound) {
			System.out.println("Match found");
			
		}else {
			System.out.println("Match not found");
		}
s.close();
	}

}
