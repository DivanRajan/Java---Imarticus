package string;

public class String_2 {

	public static void main(String[] args) {
		String s1="google";
		String s2="google";
		String s3=new String("google");
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s1==s2);
		System.out.println(s2==s3);
	}

}
