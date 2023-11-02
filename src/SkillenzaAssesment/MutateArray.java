package SkillenzaAssesment;

import java.util.Scanner;

public class MutateArray {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter size of the Array: ");
	int n=s.nextInt();
	int a[]=new int[n];
	System.out.println("Enter Array Elements One By One: ");
	for(int i=0;i<n;i++) {
		a[i]=s.nextInt();
		
	}
	for(int i=0;i<n;i++) {
		if(i==0 && a[0]==0)
			a[0]=a[1];
		else if(i==n-1 && a[n-1]==0)
			a[n-1]=a[n-2];
		else if(a[i]==0)
			a[i]=a[i-1]+a[i+1];
		}
	for(int arr:a) {
		System.out.println(arr);
	}
	s.close();
	}
}

	