package Variable;

public class Local_variable {
	int a;
	public void display() {
		a=10;
		int b=50;
		System.out.println(a);
		System.out.println(b);
	}
	public void display1() {
		System.out.println(a);
		
	}

	public static void main(String[] args) {
		Local_variable lv=new Local_variable();
		lv.display();
		lv.display1();

	}

}
