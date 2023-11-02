package Assessment;
import java.util.Scanner;
public class If_Leap_year_9 {

	public static void main(String[] args) {
		int year;
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER THE YEAR :");
		year = s.nextInt();
		if(year%4==0) {
			System.out.println("YES");
		}
			else {
				System.out.println("NO");
			}
          s.close();
	}

}
