package assignments;
import java.util.Scanner;
public class Peterson_number {

	public static void main(String[] args) {
		int num,split,fact,sum,num1;
		Scanner s = new Scanner(System.in);
		System.out.print("ENTER THE NUMBER:");
		num =s.nextInt();
		num1=num;
		fact=1;
		sum=0;
		while(num>0) {
		fact=1;
		split=num%10;
		System.out.println(split);
		for(int i=split;i>0;i--){
		    fact=fact*i;
		}
		sum=sum+fact;
		System.out.println(fact);
		System.out.println(sum);
		num=num/10;
	if(num1==sum) 
	{
		System.out.print("IT IS PETERSON NUMBER:");
	}
	else 
	{
		System.out.print("IT IS NOT PETERSON NUMBER:");
	}
	}
	}
}
		
		
			


