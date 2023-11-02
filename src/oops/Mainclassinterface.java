package oops;
interface base1{
	public void fun1();
}
interface base2{
	public void fun2();
}
class InterImple implements base1,base2{
	public void fun2() {
		System.out.println("fun2");
	}
	public void fun1() {
		System.out.println("fun1");
	}
}
public class Mainclassinterface {

	public static void main(String[] args) {
		InterImple obj=new InterImple();
		obj.fun1();
		obj.fun2();

	}

}
