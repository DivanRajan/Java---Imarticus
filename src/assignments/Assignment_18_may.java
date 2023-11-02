package assignments;
	import java.util.Scanner;
public class Assignment_18_May {

		public static void main(String[] args) {

			int n;
			
			Scanner scn=new Scanner(System.in);
			System.out.println("Enter no. of tickets : ");
			n=scn.nextInt();
			
			int arr[]=new int[n];
			
			System.out.println("Enter ticket numbers : ");
			for(int i=0;i<n;i++) {
				arr[i]=scn.nextInt();
			}
			
			int k;
			System.out.println("Enter date : ");
			k=scn.nextInt();
			
			for(int i=0;i<n;i++) {
				if(arr[i]%k==0) {
					System.out.print("1 ");
				}
				else {
					System.out.print("0 ");
				}
			}
			
		}

	}
