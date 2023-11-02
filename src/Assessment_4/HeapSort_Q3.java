package Assessment_4;

import java.util.Scanner;

public class HeapSort_Q3 {
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
			int maxIndex;
			for(int step=0;step<n-1;step++) {
				maxIndex=step;
				for(int i=n-1;i>=step;i--) {
					if(arr[maxIndex]>arr[i]) {
						maxIndex=i;
					}
				}
				temp=arr[maxIndex];
				arr[maxIndex]=arr[step];
				arr[step]=temp;
				}
			System.out.println("Array After Heap Sort:");
			for(int i=0;i<n;i++) {
				System.out.print(arr[i]+" ");
			}
			s.close();
	}

}
