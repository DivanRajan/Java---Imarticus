package ArrayPractice;
import java.util.Scanner;
public class CountNoOfOccurence {

	public static void main(String[] args) { 
		   {  
		       Scanner s=new Scanner(System.in);

		      int n;   
		      System.out.println("Enter the total number of elements ");
		      n=s.nextInt();   
		      int arr[]=new int[n];  
		      System.out.println("Enter the elements of the array ");
		      for(int i=0; i<n ;i++){
		          arr[i]=s.nextInt();
		      }
		        System.out.println("Enter the element of which you want to count number of occurences");
		        int ele=s.nextInt();
		        int count=0;
		        for(int i=0;i<n;i++){
		            if(ele==arr[i]){
		                count++;
		            }
		        }
		        System.out.println(ele+" occurred "+count+" times ");
		        
		       
		   }
		  

		}

	
}
