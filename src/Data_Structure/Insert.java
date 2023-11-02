package Data_Structure;
import java.util.Scanner;
public class Insert {

	public static void main(String[] args) {
	
	int ins_ele,len,pos,ind,j,n;
	Scanner s=new Scanner(System.in);
	System.out.print("Enter the array element");
	n=s.nextInt();
	int arr[]=new int[n+1];
	System.out.println("\nEnter the aaray element:");
	for(int i=0;i<n;i++) {
		arr[i]=s.nextInt();
	}
	System.out.println("insert elemnt:");
	pos=s.nextInt();
	j=pos;
	System.out.println("Original Array:");
	for (int i=0;i<n;i++) {
	System.out.print(arr[i]+" ");
	}
	System.out.println();
	System.out.println("j="+j);
	while(j<n) {
		arr[j]=arr[j-1];
		j++;
	}
	n=n-1;
	System.out.println("deleted Array:");
	for(int i=0;i<n;i++) {
		System.out.println(arr[i]+" ");
	}
	}

}
