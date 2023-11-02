package Data_Structure;
import java.util.Scanner;
public class Insert_1 {
	public static void printarray(int[] a,int n) {
		for(int i=0;i<n;i++) {
			System.out.println(a[i]+" ");
		}
	}
	public static void insertelement(int[] a,int n,int Ele,int pos) {
		int length=n;
		int index=pos-1;
		while (length>=index){
			a[length]=a[length-1];
			length--;
		}
		a[index]=Ele;
	}

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter size of the array : ");
	int n =s.nextInt();
	int []arr=new int[n+1];
	for(int i=0;i<n;i++) {
		arr[i]=s.nextInt();
	}
System.out.println("Original Array : ");
printarray(arr,n);

System.out.println("Enter the element to insert : ");
int insEle=s.nextInt();
System.out.println("Enter the position");
int pos=s.nextInt();
insertelement(arr,n,insEle,pos);
System.out.println("Enter the position");

	}

}
