package assignments;
import java.util.Scanner;
public class Series2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter N th in the series to Print:");
		int n=s.nextInt();
		int arr[]=new int[n];		
		int fib1=0;
		int fib2=1;
		int fib3;
		int num=2,j;
		for(int i=0;i<n;i++) {
			if(i%2!=0) {
				arr[i]=fib1;
				fib3=fib1+fib2;
				fib1=fib2;
				fib2=fib3;
				}
			else {
				j=2;
				while(num%j!=0) {
					j++;
				}
				if(num==j) {
					arr[i]=num;
					num++;
				}
				else
					num++;
			}
		}
		System.out.println("The Nth term in the series is "+arr[n-1]);
		
		s.close();
	}

}
