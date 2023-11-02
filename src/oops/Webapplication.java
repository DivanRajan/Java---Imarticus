package oops;
class about{
	void show() {
		System.out.println("Welcome to Sairam Racks");
	}
	
}
class product extends about{
void show1() {
	System.out.println("Supermarket Racks");
}
	
}

class contactus extends product{
	void show2() {
		System.out.println("sairamrackscbe@gmail.com");
	}
}

public class Webapplication {

	public static void main(String[] args) {
	contactus obj =new
			contactus();
	obj.show();
	obj.show1();
	obj.show2();

	}

}
