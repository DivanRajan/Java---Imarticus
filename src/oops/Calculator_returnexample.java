package oops;

public class Calculator_returnexample {
	int result;
	void add(int num1,int num2) {
		result = num1+num2;
		System.out.println("add:"+result);		
		}
	int sub(int num1,int num2) {
		result = num1-num2;
		return result;
		
		
	}

	public static void main(String[] args) {
		Calculator_returnexample c =  new Calculator_returnexample();
		c.add(10,20);
		System.out.println("sub:"+c.sub(50,10));

	}

}
