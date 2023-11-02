package Variable;

public class Student_constructor {
	int stud_id;
	String stud_name;
	String college;
	public Student_constructor() {
		stud_id=101;
		stud_name="sathish";
		college="ABC Engineering College";
		System.out.println(stud_id);
		System.out.println(stud_name);
		System.out.println(college);
				
	}
	public Student_constructor(int id,String name,String col) {
		System.out.println(id);
		System.out.println(name);
		System.out.println(col);
		
		
	}
	
	public static void main(String[] args) {
		Student_constructor sc=new Student_constructor();
		Student_constructor sc1=new Student_constructor(102,"ganga","MERIT");

	}

}
