package Graph;

import java.util.Arrays;
import java.util.Scanner;

public class FloodFill {
	private void fillGrid(char[][]arr,int r,int c) {
		if(arr[r][c]=='p') {
			arr[r][c]='w';
			display(arr);
			fillGrid(arr,r+1,c);
			fillGrid(arr,r-1,c);
			fillGrid(arr,r,c+1);
			fillGrid(arr,r,c-1);
		}
	}
private void display(char[][]arr) {
	System.out.println("\nGrid : ");
	for(int i=1;i<arr.length-1;i++) {
		for(int j=1;j<arr[i].length-1;j++)
			System.out.println(arr[i][j]+" ");
		System.out.println();
	}
}
	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Flood FillTest\n");
System.out.println("Enter dimensions of grid");
int M=s.nextInt();
int N=s.nextInt();
char[][]arr=new char[M+2][N+2];
for(int i=0;i<M+2;i++)
	Arrays.fill(arr[i], '0');
System.out.println("Enter grid with 'p for passage amd '0' for obstacle");
for(int i=1;i<M+1;i++)
	for(int j=1;j<N;j++)
		arr[i][j]=s.next().charAt(0);
System.out.println("Enter coordinates to start");
int sr=s.nextInt();
int sc=s.nextInt();
if(arr[sr][sc]!='p') {
	System.out.println("Invalid coordinates");
	System.exit(0);
}
FloodFill ff=new FloodFill();
ff.fillGrid(arr,sr,sc);
s.close();
	}

}
