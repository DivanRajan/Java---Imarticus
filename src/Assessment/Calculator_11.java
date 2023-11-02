package Assessment;

public class Calculator_11 {

	public static void main(String[] args) {
		double first=100;
		double second=25;
		double result=1;
		char operator='/';
	
		switch(operator) {
			case'+':
				result=first+second;
				break;
			case'-':
				result=first-second;
				break;
			case'*':
				result=first*second;
				break;
			case'/':
				result=first/second;
				break;
			default:
				System.out.println("error operator is not correct");
		}
		
		System.out.println(result);	

	}

}

