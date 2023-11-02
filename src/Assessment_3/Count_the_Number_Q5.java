package Assessment_3;
import java.util.Scanner;  
public class Count_the_Number_Q5 {  
		   public static void main(String args[])   
		   {  
		       Scanner s=new Scanner(System.in);

		      int n;    
		      System.out.println("Enter the total number of elements ");
		      n=s.nextInt();     
		      int arr[]=new int[n];   
		      System.out.println("Enter the elements of the array ");
		      for(int i=0; i<n ;i++)  
		      {
		          arr[i]=s.nextInt();
		      }
		        System.out.println("Enter the element whose frequency you want to know");
		        int ele=s.nextInt();
		        int occ=0;
		        for(int i=0;i<n;i++)
		        {
		            if(ele==arr[i])
		            {
		                occ++;
		            }
		        }
		        System.out.println(ele+" occurred "+occ+" times ");
		        
		       s.close();
		   }
		
	
}
