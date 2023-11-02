package oops;
class person{
	void show() {
		System.out.println("person class");
	}
	
}
class student extends person{
void show1() {
	System.out.println("Student class");
}
	
}

class Engineeringstudent extends student{
	void show2() {
		System.out.println("Engineering student class");
	}
}
public class Multileveldemo {

	public static void main(String[] args) {
		Engineeringstudent obj =new
				Engineeringstudent();
		obj.show();
		obj.show1();
		obj.show2();
	}

}`
