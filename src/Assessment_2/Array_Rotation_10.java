package Assessment_2;

import java.util.Scanner;

public class Array_Rotation_10 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int arr[]= {1,2,3,4,5};
		int rot,x;
			System.out.println("Number of Rotation:");
			rot = s.nextInt();
		int n=arr.length;
		for(int r=1;r<=rot;r++) {
		x=arr[n-1];
		for(int i=n-2;i>=0;i--) {
			arr[i+1]=arr[i];
		}
		arr[0]=x;
		System.out.println("Rotated Array:");
		for(int array:arr) {
			System.out.println(array+" ");
			s.close();
			}
		}
	}
}

