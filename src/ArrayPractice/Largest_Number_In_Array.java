package ArrayPractice;
import java.util.Scanner;
public class Largest_Number_In_Array {

	public static void main(String[] args) {
	Scanner  s =new Scanner(System.in);
    int n;   
    System.out.println("Enter  number of elements in an array ");
    n=s.nextInt();   
    int arr[]=new int[n];  
    System.out.println("Enter the elements of the array ");
    for(int i=0; i<n ;i++){
        arr[i]=s.nextInt();
       }
    for(int i=0; i<n; i++)
        arr[i] = s.nextInt();
     
     int large = arr[0];
     for(int i=1; i<10; i++)
     {
        if(large<arr[i])
           large = arr[i];
     }
     
     System.out.println("Largest Number = " +large);
  }
	
}
