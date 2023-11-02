package Assessment_4;

import java.util.Scanner;

public class Insertion_Q1 {
	public static void insertionsort(int[] a,int n) {		
		int key,temp;
		for(int step=1;step<n;step++) {
		key=step;
		for(int i=step-1;i>=0;i--) {
			if(a[i]>a[key]) {
				temp=a[i];
				a[i]=a[key];
				a[key]=temp;
				key--;
				}
			}
		}		
	}	
public static void printarray(int[] a,int n) {		
		for(int i=0;i<n;i++) {
		System.out.print(a[i]+" ");
		}		
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
		insertionsort(arr,n);		
		System.out.println("Array after insertion sort : ");
		printarray(arr,n);		
		s.close();		
		}
	}
