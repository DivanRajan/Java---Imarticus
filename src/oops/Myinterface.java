package oops;
interface Myinterface1
{
	public void method1();
	public void method2();
}
class Myinterface implements Myinterface1
{
	public void method1()
	{
		System.out.println("implementation of method1");
	}
	public void method2()
	{
		System.out.println("implementaation of method2");
	}

	public static void main(String[] args) {
		Myinterface1 obj=new Myinterface();
		obj.method1();

	}

}
