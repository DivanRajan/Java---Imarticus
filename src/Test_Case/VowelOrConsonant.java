package Test_Case;

import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {
		char ch;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Character");
		ch=s.next().charAt(0);
		switch(ch) {
		case 'a':
		case 'A':
		case 'e':
		case 'E':
		case 'i':
		case 'I':
		case 'o':
		case 'O':
		case 'u':
		case 'U':
			System.out.println("This Is Vowel:"+ch);
			break;
			default:
				System.out.println("This Is Consonants:"+ch);
		}
	}

}
