package oops;
class person1{
	void show() {
		System.out.println("base class");
	}
}
class Teacher1 extends person1{
	void show1() {
		System.out.println("Teacher class");
	}
}
class Student1 extends person1{
	void show2() {
		System.out.println("Student class");
	}
}
class Doctor extends person1{
	void show3() {
		System.out.println("Doctor class");
	}
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		//person obj=new person();
		Teacher1 teacher=new Teacher1();
		Student1 obj1=new Student1();
		Doctor obj2=new Doctor();
		teacher.show();
		teacher.show1();
		obj1.show2();
		obj2.show3();
	}

}
