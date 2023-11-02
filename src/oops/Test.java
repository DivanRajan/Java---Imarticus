package oops;
class person{
	void show() {
		System.out.println("base class");
	}
}
class Teacher{
	void show1() {
		System.out.println("Teacher class");
	}
}
class Student{
	void show2() {
		System.out.println("Student class");
	}
}
class Doctor{
	void show3() {
		System.out.println("Doctor class");
	}
}
public class Test {

	public static void main(String[] args) {
		person obj=new person();
		Teacher obj=new Teacher();
		Student obj=new Student();
		Doctor obj=new Doctor();
		person.show();
		Teacher.show1();
		Student.show2();
		Doctor.show3();
	}


	}
