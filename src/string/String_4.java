package string;

public class String_4 {

	public static void main(String[] args) {
		String string="abcdef";
		String reverse = new StringBuffer(string).reverse().toString();
		System.out.println("\nString before reverse:");
		System.out.println("String after reverse:"+reverse);
	
	}

}
