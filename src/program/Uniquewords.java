package program;

import java.util.Scanner;

public class Uniquewords {
	static int calculateNoOfUniqueWords(String str) {
		String[]words=str.split(" ");
		boolean[]array=new boolean[words.length];
		int j,i=0;
		int count=0;
		for(i=0;i<words.length;i++) {
			if(!array[i]) {
				count++;
				for(j=i+1;j<words.length;j++) {
					if(words[j].compareTo(words[i])==0) {
						array[j]=true;
						count--;
					}
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String str;
	System.out.println("Enter the String");
	str=s.nextLine();
	int count= calculateNoOfUniqueWords(str);
	System.out.println("Total number of unique words in\""+str+"\"are"+count);
	s.close();
	}
}
