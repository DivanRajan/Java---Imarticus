package oops;
import java.util.Scanner;
class Rectangle{
	int length;
	int width;
	int result;
	void insert(int l,int w) {
		length=l;
		width=w;
		
	}
	int calculateArea() {
		result=length*width;
		return result;
		
	}
}
public class Testrectangle2 {

	public static void main(String[] args) {
		int a[]=new int[5];
		int b[]=new int[5];
		Scanner s= new Scanner(System.in);
		Rectangle r1=new Rectangle();
		for(int i=0;i<5;i++) {
			System.out.println("Enter the length and width:");
			a[i]=s.nextInt();
			b[i]=s.nextInt();
		} 
	for(int i=0;i<5;i++) {
		r1.insert(a[i],b[i]);
		System.out.println("Arrea of Rectangle:"+(i+1));
		System.out.println(r1.calculateArea());
		}
		

	}

}
