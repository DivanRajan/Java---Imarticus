package string;

public class String_3 {

	public static void main(String[] args) {
	String strOrig="Hello word,Hello Reader,Hello";
	int LastIndex=strOrig.lastIndexOf("Hello");
	if(LastIndex==-1) {
		System.out.println("Hello not found");
	}
	else
	{
		System.out.println("Lastnoccurance of Hello is at index"+LastIndex);
	}
	}

}
