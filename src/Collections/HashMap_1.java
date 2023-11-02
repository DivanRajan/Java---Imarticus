package Collections;
import java.util.HashMap;
import java.util.Map;
public class HashMap_1 {

	public static void main(String[] args) {
		Map<String,Integer>m1=new HashMap<String,Integer>();
		m1.put("Zara", 8);
		m1.put("Mahnaz", 31);
		m1.put("Ayan", 12);
		m1.put("Daisy", 14);
		System.out.println();
		System.out.println("Map Elements");
		System.out.println("\t"+m1);
		System.out.println(m1.get("Ayan"));
		
	}

}
