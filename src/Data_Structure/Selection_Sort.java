package Data_Structure;

import java.util.Scanner;

public class Selection_Sort {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of the Arrayy");
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter Elements of the Array:");
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int temp;
		int minIndex;
		for(int step=0;step<n-1;step++) {
			minIndex=step;
			for(int i=step+1;i<n;i++) {
				if(arr[minIndex]>arr[i]) {
					minIndex=i;
				}
			}
			temp=arr[step];
			arr[step]=arr[minIndex];
			arr[minIndex]=temp;
			}
		System.out.println("Array After Selection Sort:");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		s.close();
	}

}
