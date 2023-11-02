package ArrayPractice;
import java.util.Scanner;
public class Second_Largest_smallest_element {
	     public static void main(String []args)
	     {
	         Scanner s=new Scanner(System.in);
	         int n;    
	         System.out.println("Enter the size of the array");
	         n=s.nextInt();   
	         int arr[]=new int[n];  
	        System.out.println("Enter the array");  
	        for(int i=0;i<n;i++){
	            arr[i]=s.nextInt();
	        }       
	        for(int i=0;i<n;i++){
	            for(int j=i+1;j<n;j++){
	                if(arr[i]<arr[j]){
	                    int temp=arr[i];
	                    arr[i]=arr[j];
	                    arr[j]=temp;
	                }
	            }
	            }
	            for(int i=n-1;i>0;i--) {
		        	if(arr[i]!=arr[i-1]) {
		        		System.out.println("Second Smallest element is "+arr[i-1]);  
		        		break;
	
		        	}
	        }
	        System.out.println("Second Largest element is "+arr[1]);   

	     
	        	
	        }	    
	}

