package Collections;

import java.util.ArrayList;

public class ArrayList_1 {

	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		ArrayList<Comparable>alist=new ArrayList<Comparable>();
		alist.add("Steve");
		alist.add("Tim");
		alist.add("Lucy");
		alist.add("Pat");
		alist.add("Angela");
		alist.add("Tom");
		alist.add(3);
		alist.add(12.0);
		System.out.println(alist);
		alist.add(3,"Steve");
		System.out.println(alist);
		alist.remove("steve");
		alist.remove("Angela");
		System.out.println(alist);
		alist.remove(2);
		alist.add(1,"harshita");
		alist.add(4,"Jasmine");
		System.out.println(alist);
		System.out.println(alist.size());
	}
}
