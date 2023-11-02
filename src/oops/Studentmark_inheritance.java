package oops;

class Student{
	
	int studId;
	String studName;
	
	void getInfo(int id, String name) {
		studId=id;
		studName=name;
	}
	
	void putInfo() {
		System.out.println("Student Name : "+studName);
		System.out.println("Student Id : "+studId);
		
	}
	
}
class Marks extends Student{
	
	int mark1;
	int mark2;
	int mark3;
	int total;
	int average;
		
	void getInfo1(int m1,int m2,int m3) {
		mark1=m1;
		mark2=m2;
		mark3=m3;
		int tot;
		int avg;
		tot=m1+m2+m3;
		avg=tot/3;
		total=tot;
		average=avg;
	}
	
	void putInfo1() {
		putInfo();
		System.out.println("Total : "+total);
		System.out.println("Average : "+average);
	}
	
}

public class Studentmark_inheritance {

	public static void main(String[] args) {

		Marks m=new Marks();
		m.getInfo1(90,91,92);
		m.putInfo1();
		
	}

}