package Assessment_4;
import java.util.*;

public class QuickSort_Q2 {

	static void printArray(int[] a,int n) {
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}
	
	static void quickSort(int[] a,int low,int high) {
		
		if(low<high) {
			
			int pivot=partition(a,low,high);
			
		
			quickSort(a,low,pivot-1);
			
			quickSort(a,pivot+1,high);
		}
		
	}
	
	static int partition(int[] a,int low,int high) {

		int pivot=a[high];
		int i=low;
		int temp;
		
		for(int j=low;j<high;j++) {
			if(a[j]<=pivot) {
				
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				i++;
			}
		}
		
		temp=a[i];
		a[i]=a[high];
		a[high]=temp;
		return (i);
		
	}
	
	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of the array : ");
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter elements of the array : ");
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		
		quickSort(arr,0,n-1);
		
		System.out.println("Array after quick sort : ");
		printArray(arr,n);
		
		
		s.close();
		
	}

}