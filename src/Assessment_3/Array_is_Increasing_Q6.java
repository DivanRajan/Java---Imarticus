package Assessment_3;
import java.util.Scanner;
public class Array_is_Increasing_Q6 {

	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of Elements");
		n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array elements:");
		for
		(int i=0;i<n;i++) {
			 arr[i]=s.nextInt();
		}
		int flag=0;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>=arr[j]) {
					flag=1;
				}
			}
		}
		if (flag==0){
			System.out.println("Array is Strictly incresing.");
		}
		else {
			System.out.println("Array is not Strictly increasing.");
		}
		s.close();

	}

}
