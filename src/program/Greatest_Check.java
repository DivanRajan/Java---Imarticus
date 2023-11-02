package program;

import java.util.Scanner;

public class Greatest_Check {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int flag=0;
	int arr[]=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=s.nextInt();
	}
	for(int i=0;i<n;i++) {
		if(arr[i]==arr[n-1])
			System.out.println(arr[i]+"->-1");
		flag=1;
		for(int j=i+1;j<n;j++) {
			if(arr[i]<arr[j]) {
				System.out.println(arr[i]+"->"+arr[j]);
				flag=1;
				break;
			}
		}
		if(flag==0)
			System.out.println(arr[i]+"->-1");
		flag=0;
	}
	s.close();
	}

}
