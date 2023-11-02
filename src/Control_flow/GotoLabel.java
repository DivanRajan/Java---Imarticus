package Control_flow;
import java.util.Scanner;
public class GotoLabel {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter N : ");
		int n=s.nextInt();
		System.out.println("Printinng N prime numbers");
		int num=2;
		N:
			for(int i=0;i<n;i++) {
				if (num==2) {
					System.out.print(num+" ");
					num++;
			}
		else {
			Task:
				for(int j=2;j<num;j++) {
					if(num%j==0) {
						num++;
						continue Task;
					}
				}
			System.out.print(num+" ");
			num++;
			continue N;
		}
	}
s.close();
	}
}
