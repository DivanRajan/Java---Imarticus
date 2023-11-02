package Assessment_2;
import java.util.Scanner;
public class Largest_Smallest_1 {

	public static void main(String[] args) {
		int m,large,small;
		Scanner s1=new Scanner(System.in);
		System.out.print("enter the number of elements");
		m=s1.nextInt();
		int arr[]=new int[m];
		System.out.println("enter the elements of array");
		for(int j=0;j<m;j++) {
			arr[j]=s1.nextInt();

		}for(int z:arr) {
			
		System.out.print(z+" ");}
		System.out.println();
		large=arr[0];
		small=arr[0];
		for (int i=0;i<m;i++) {
			if(arr[i]>large) {
				large=arr[i];
			}
		}	System.out.println("Largest number: "+large);
		for (int i=0;i<m;i++) {
			if(arr[i]<small) {
				small=arr[i];
			}
		}	System.out.println("Smallest Number: "+small);
			s1.close();
	}

}
