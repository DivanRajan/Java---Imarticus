package Practice;
import java.util.Scanner;
public class Practice_8 {

	public static void main(String[] args) {
		int age,salary,bonus;
		String name;
		Scanner s=new Scanner(System.in);
		System.out.print("Name : ");
		name=s.next();
		System.out.print("Age : ");
		age=s.nextInt();
		System.out.print("Salary : ");
		salary=s.nextInt();
		System.out.println("Salary with bonus : "+(salary+(salary/10)));
		s.close();
	}

}
