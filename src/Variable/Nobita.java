package Variable;
import java.util.Scanner;
public class Nobita {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the purchasing prize:");
		int purchasing=s.nextInt();
		System.out.print("Enter the selling prize prize:");
		int selling=s.nextInt();
		System.out.println("Difference:"+Math.abs(purchasing-selling));
	}

}
