package Array;
import java.util.Arrays;
import java.util.Scanner;
public class CheckLeader {

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
       int leader,num=n,flag=0,k=0;;
       int[]lead=new int[num];
       for(int i=0;i<n;i++) {
    	   leader=arr[i];
    	   for(int j=i+1;j<n;j++) {
    		   if(leader<arr[j]) {
    			   flag=1;
    		   }
    	   }
    	   if(flag==0) {
      		   lead[k]=leader;
    		   k++;
    		   
    	   }
    	   else {
    		   flag=0;
    		   num--;
    	   }
    	   }
    	   Arrays.sort(lead);
		System.out.println("The leaders are :");
		for(int i:lead) 
			System.out.println(i+" ");
		
		s.close();
	}

}
