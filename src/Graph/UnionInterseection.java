package Graph;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class UnionInterseection {
	static void displayunionandIntersection(int[]arrayone,int[]arraytwo) {
		Set<Integer>obj =new HashSet<>();
		int i,j;
		for(i=0;i<arrayone.length;i++) {
			obj.add(arrayone[i]);
		}
		for(j=0;j<arraytwo.length;j++) {
			obj.add(arraytwo[j]);
		}
		System.out.println("the union of both the arrays is:");
		for(Integer I:obj) {
			System.out.println(I+" ");
		}
		System.out.println();
		obj.clear();
		System.out.println("The intersection of both the arrays is");
		for(i=0;i<arrayone.length;i++) {
			obj.add(arrayone[i]);
			
		}
		for(j=0;j<arraytwo.length;j++) {
			if(obj.contains(arraytwo[j]))
				System.out.println(arraytwo[j]+"");	
		}
	}

	public static void main(String[] args) {
		Scanner br=new Scanner(System.in);
		int m,n;
		System.out.println("Enter the size of the two arrays");
		n=br.nextInt();
		m=br.nextInt();
		int[]arrayone=new int[n];
		int[]arraytwo=new int[m];
		System.out.println("enter the first aarray elements");
		
		for(int i=0;i<arrayone.length;i++) {
			arrayone[i]=br.nextInt();
			
		}
		System.out.println("enter the second array elements");

				for(int i=0;i<arraytwo.length;i++) {
					arraytwo[i]=br.nextInt();
					
				}
				displayunionandIntersection(arrayone,arraytwo);
				br.close();
		
	}
}
