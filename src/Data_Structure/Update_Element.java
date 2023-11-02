package Data_Structure;

import java.util.Scanner;

public class Update_Element {

	public static void main(String[] args) {

		int ins_ele,len,pos,ind,j,n;
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER THE ARRAY SIZE");
		n=s.nextInt();
		int arr[]=new int[n+1];
		System.out.println("ENTER THE ARRAY ELEMENT:");
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		
		System.out.println("POSITION OF ELEMENT :");
		pos=s.nextInt();
		System.out.println("ENTER THE ELEMENT TO UPDATE:");
		int el=s.nextInt();
		
		System.out.println("ORIGINAL ARRAY:");
		for (int i=0;i<n;i++) {
		System.out.println(arr[i]+" ");
		}
		System.out.println();
		
		arr[pos-1]=el;
		
		System.out.println("UPDATE ARRAY:");
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]+" ");
		}
		}

	}

