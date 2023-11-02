package oops;
interface moveable{
	public void run();
}
interface speakable{
	public void speak();
}
interface ability extends moveable,speakable{
	public void show();
}
class person3 implements ability{
	public void run ()
	{
		System.out.println("i can run!!");
	}
public void speak()
{
	System.out.println("i can speak!!");
}
public void show()
{
	System.out.println("i am a person ,i can speak and run");
}
}
public class Multiple_Inheritance {

	public static void main(String[] args) {
		person3 obj =new person3();
		obj.run();
		obj.speak();
		obj.show();
	}

}
