package Array;
import java.util.Scanner;
public class Identity_Matrix {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no. of rows : ");
		int rows=s.nextInt();
		System.out.println("Enter no. of columns : ");
		int columns=s.nextInt();
		
		int[][] a=new int[rows][columns];
		System.out.println("Enter elements of the Matrix : ");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				a[i][j]=s.nextInt();
			}
		}
		
		System.out.println("Elements of the Matrix : ");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		int count=0;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				if(i==j) {
					if(a[i][j]!=1)	
						count++;
				}
				else {
					if(a[i][j]!=0)
						count++;
				}
			}

		}
		if(count!=0)
			System.out.println("Not an Identity Matrix");
		else
			System.out.println("It is an Identity Matrix");
		
		s.close();
	}
	}

