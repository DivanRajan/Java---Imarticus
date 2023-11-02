package Data_Structure;

import java.util.Scanner;

public class Search {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("ENTER THE ARRAY SIZE");
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("ENTER THE ARRAY ELEMENT:");
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println("ENTER THE ELEMENT TO BE SEARCHED");
		int el=s.nextInt();
		
	
		System.out.println("ORIGINAL ARRAY:");
		for (int i=0;i<n;i++) {
		System.out.println(arr[i]+" ");
		}
		System.out.println();
		int flag=0;
		
		for(int i=0;i<n;i++) {
			if(arr[i]==el){
				System.out.println("SEARCH ELEMENT IS FOUND IN THE POSITION:"+(i+1));
				flag=1;
			}
		}
		if(flag==0) {
			System.out.println("SEARCH ELEMENT NOT FOUND");
		}
		
		}

	}
