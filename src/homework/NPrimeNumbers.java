package homework;
import java.util.*;
public class NPrimeNumbers {

	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);				
				int  i,n,p,count,flag;
				p=2;
				i=1;
				System.out.println("Enter the number of prime Numbers");
		    		n=sc.nextInt();
		    	System.out.println("prime numbers :"); 
			    while(i<=n){
			    	flag=1;
		        for(count=2;count<=p-1;count++){
		        	if(p%count==0){
			    flag=0;
			    	break;     
		        } 	 
		          }
		        if(flag==1) {
		        	System.out.print(p+" ") ;
			         i++;
		            }
		        	 p++;
		    		}
			}
		}

