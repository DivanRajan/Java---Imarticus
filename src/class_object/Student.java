package class_object;
class Data{
	int studId=101;
	String studName="Jasmine";
	void display() {
		System.out.println("Stud ID:"+studId);
		System.out.println("Stud Name:"+studName);
	}
}
public class Student {

	public static void main(String[] args) {
		Data d=new Data();
		d.display();

	}

}
