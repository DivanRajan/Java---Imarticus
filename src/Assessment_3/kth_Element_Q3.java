package Assessment_3;
import java.util.Scanner;
public class kth_Element_Q3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of elements : ");
		int n=s.nextInt();
		
		int[] arr=new int[n]; 
		
		System.out.println("Enter all elements : ");
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		
		System.out.println("Enter the position at which you want to check number : ");
		int index=s.nextInt();
		
		System.out.println("Number found at position "+index+" is : "+arr[index-1]);
		s.close();
	}

}
