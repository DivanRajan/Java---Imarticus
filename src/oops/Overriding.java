package oops;
class person_5{
	public void role() {
		System.out.println("Son/Daughter");
	}
}
public class Overriding1 extends person_5{
	public void role() {
		super.role();
		System.out.println("Student");
	}
public class Overriding {

	public static void main(String[] args) {
		Overriding1 or=new Overriding1();
		or.role();
	}
	
}
}
