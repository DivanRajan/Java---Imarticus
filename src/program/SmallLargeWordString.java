package program;
import java.util.Scanner;
public class SmallLargeWordString {
static void wordFind(String str){
	String[]words=str.split(" ");
	String min=words[0];
	String max=words[0];
	for(int i=1;i<words.length;i++) {
		if(min.length()>words[i].length())
			min=words[i];
		if(max.length()<words[i].length())
			max=words[i];
	}
	System.out.println("Smallest :"+min);
	System.out.println("Largest : "+max);
}

public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		String str;
		System.out.println("Enter the String :");
		str=s.nextLine();
		wordFind(str);
		s.close();
}
	
	}