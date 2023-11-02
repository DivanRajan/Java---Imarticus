package homework;
import java.util.Scanner;
public class PrintingNNumbers {
		public static void main(String[] args) {
			Scanner scn=new Scanner(System.in);
			System.out.println("Enter N : ");
			int n=scn.nextInt();
			System.out.println("Printing N numbers : ");
			for(int i=1;i<n;i++) {
				
				System.out.println(i+" ");
				scn.close();
			}
			

		}

	}