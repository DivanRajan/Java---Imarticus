package class_object;
import java.util.Scanner;
public class Insertion_Sort {
		static void insertionsort(int a[],int n) {
			int temp,key;
			for(int step=1;step<n;step++) {
				key=step;
				for (int j=step-1;j>=0;j--) {
					if (a[j]>a[key]) {
						temp=a[j];
						a[j]=a[key];
						a[key]=temp;
						key--;
					}
				}
			}
		}
		static void print_array(int a[],int n) {
			for (int i=0;i<n;i++){
			System.out.println(a[i]+" ");
			}
		}

		public static void main(String[] args) {
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		n=s.nextInt();
		int a[]=new int[n];
				System.out.println("Enter the array elements one by one:");
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		insertionsort(a,n);
		System.out.println("Elements after the insertionsort:");
		print_array(a,n);
		s.close();
		}

	}



