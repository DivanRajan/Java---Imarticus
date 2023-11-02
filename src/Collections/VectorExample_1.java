package Collections;
import java.util.*;
public class VectorExample_1 {

	public static void main(String[] args) {
	Vector<String>vec=new Vector<String>(2);
	//adding elements to a vector
	vec.addElement("Apple");
	vec.addElement("Orange");
	vec.addElement("Mango");
	vec.addElement("Fig");
	//check size and capacity Increment
	System.out.println("Size is: "+vec.size());
	System.out.println("Default capacity increment is: "+vec.capacity());
	vec.addElement("Fruit1");
	vec.addElement("Fruit2");
	vec.addElement("Fruit3");
	//size and capacity Increment after two insertion
	System.out.println("Size after addition:"+vec.size());
	System.out.println("Capacity after increment is: "+vec.capacity());
	//display vectro elemement
	Enumeration en=vec.elements();
	System.out.println("\nElements are: ");
	while(en.hasMoreElements())
		System.out.println(en.nextElement()+" ");
	}
}
