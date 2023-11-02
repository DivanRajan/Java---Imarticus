package SkillenzaAssesment;
import java.util.Scanner;
public class SumDigitsString {

	public static void main(String[] args) {
		int b,sum=0;
	Scanner s=new Scanner (System.in);
	String str=s.next();
	for(int i=0;i<str.length();i++) 
	{
		if(Character.isDigit(str.charAt(i)))
				{
			b=Integer.parseInt(String.valueOf(str.charAt(i)));
			sum=sum+b;
			
				}
			}
	System.out.println(sum);
	s.close();
		}

	}
