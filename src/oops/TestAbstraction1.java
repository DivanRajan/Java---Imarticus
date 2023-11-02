package oops;
abstract class shape{
abstract void draw(); 
}
class Rectangle extends shape{
	void draw ()
	{System.out.println("drawing rectangle");}
}
class circle1 extends shape{
	void draw() {
		System.out.println("drawing circle");
	}
}
class TestAbstraction1 {
	public static void main(String[] args) {
		shape s=new circle1();
		s.draw();
	}
	
}
