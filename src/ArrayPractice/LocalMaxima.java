package ArrayPractice;

import java.util.Scanner;

public class LocalMaxima {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int n;    
        System.out.println("Enter the size of the array");
        n=s.nextInt();   
        int arr[]=new int[n];  
       System.out.println("Enter the array");  
       for(int i=0;i<n;i++){
           arr[i]=s.nextInt();
       }
       int localMaxima=arr[0];
       for(int i=0;i<n;i++) {
    	   if(i==0) {
    		   if(arr[i]>arr[i+1]) {
    			   localMaxima=arr[i];
    			   break;
    		   }
    	   }
    	   else if(i==n-1) {
    		   if(arr[i]>arr[i-1]) {
    			   localMaxima=arr[i];
    			   break;
    		   }
    	   }
    		   else {
    			   if((arr[i]>arr[i-1]) && (arr[i]>arr[i+1])){
    			   localMaxima=arr[i];
    				   break;
    			   }
    	   }
       }
       System.out.println("local maxima of the array:"+localMaxima);
	}

}
