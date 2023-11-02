package Collections;
import java.util.*;
public class ArrayList_3 {

	public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<String>();
	al.add("c");
	al.add("A");
	al.add("E");
	al.add("B");
	al.add("D");
	al.add("F");
	System.out.println("Original Contents of all:");
	Iterator itr=al.iterator();
	while(itr.hasNext()) {
		Object element=itr.next();
		System.err.println(element+" ");
	}
	System.out.println();
	Listerator litr=al.listIterator();
	while(litr.hasNext()) {
		Object element=litr.next();
		litr.set(element+"+");
		}
	System.out.println("Modifioed contents of al:");
	itr=al.iterator();
	while(itr.hasNext()) {
		Object element=itr.next();
		System.out.println(element+" ");
	}
	System.out.println();
	System.out.println("Modified List Backwards: ");
	while(litr.hasPrevious()) {
		Object element=litr.previous
	}
			}

}
