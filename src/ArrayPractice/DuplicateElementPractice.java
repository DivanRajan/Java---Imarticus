package ArrayPractice;

import java.util.Scanner;

public class DuplicateElementPractice {
	static int RemoveDuplicates(int arr[],int n) {
		int replaceindex=0,i,j;
		for(i=0;i<n;i++) {
			for(j=i+1;j<n;j++) {
				if(arr[j]!=arr[i]) {
					break;
				}
			}
			arr[replaceindex++]=arr[i];
			i=j-1;
		}
		return replaceindex;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the array element");
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
			
		}

		int index=RemoveDuplicates(arr,n);
		System.out.println("array after removing duplicate elements6");
		for(int i=0;i<index;i++) {
			System.out.println(arr[i]+" ");
		}
		s.close();

	}

}
