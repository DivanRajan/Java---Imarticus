package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMap_Loop {

	public static void main(String[] args) {
		HashMap<Integer,String>hmap=new HashMap<Integer,String>();
		//Adding elements to HashMap
		hmap.put(11, "AB");
		hmap.put(2, "CD");
		hmap.put(33, "EF");
		hmap.put(9, "GH");
		hmap.put(3, "IJ");
		System.out.println("For Loop:");
		for (Map.Entry me:hmap.entrySet()) {
			System.out.println("Key: "+me.getKey()+"& value: "+me.getValue());
		}
		System.out.println("While Loop:");
		Iterator<?> iterator=hmap.entrySet().iterator();
		while(iterator.hasNext()) {
			Map.Entry me2=(Map.Entry)iterator.next();
			System.out.println("key:"+me2.getKey()+"& value:"+me2.getValue());
			
		}
		
	}

}
