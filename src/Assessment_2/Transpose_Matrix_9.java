package Assessment_2;

public class Transpose_Matrix_9 {

	public static void main(String[] args) {
		int row=2;
		int column=3;
		int[][] matrix= {{1,2,3},{4,5,6}};
		System.out.println("The above matrix before transpose");
		display(matrix);
		
		int[][] transpose=new int[column][row];
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				transpose[j][i]=matrix[i][j];
			}
		}
		System.out.println("The above matrix after transpose");
		display(transpose);
		
	}
	
	public static void display(int[][] matrix) {
		
		System.out.println("Matrix : ");
		for(int[] r:matrix) {
			for(int c:r) {
				System.out.print(c+" ");
			}
			System.out.println();
		}
		
	}

}
