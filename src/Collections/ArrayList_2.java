package Collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class ArrayList_2 {

	public static void main(String[] args) {
		ArrayList<String> arr=new ArrayList<String>();
			Scanner s=new Scanner(System.in);
				System.out.println("Enter the number of elements: ");
					int n=s.nextInt();
		/*arr.add("Steve");
		arr.add("Tim");
		arr.add("lucy");
		arr.add("pat");
		arr.add("Angela");
		arr.add("Tom");*/
		System.out.println("Enter the array elements one by one: ");
		for(int i=0;i<n;i++)
		{
		arr.add(s.next());
		}
		arr.set(2,"Malathy");
		System.out.println("ArrayList: ");
		System.out.println(arr);
		Collections.sort(arr);
		System.out.println("ArrayList using for each: ");
		for(String str1:arr) 
		{
		System.out.println(str1);
		}
		System.out.println(arr.get(2));
		System.out.println(arr.indexOf("Malathy"));
		System.out.println(arr.contains("Ramesh"));
		arr.clear();
		System.out.println(arr);
		s.close();
	}
}
