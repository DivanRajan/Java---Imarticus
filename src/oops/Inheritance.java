package oops;
class Base{
	int emp_id;
	String emp_name;
	void getInfo(int id,String name) {
		
		emp_id=id;
		emp_name=name;
	}
	void putinfo() {
		System.out.println("Employee Id:"+emp_id);
		System.out.println("Employee Name:"+emp_name);
	}
	}
class Derived extends Base{
	String designation;
	int salary;
	void getInfo1(String desig,int sal) {
		getInfo(101,"malar");
		designation=desig;
		salary=sal;
		
	}
	void putInfo1() {
		putinfo();
		System.out.println("Designation:"+designation);
		System.out.println("Salary:"+salary);
		
		
	}
}
public class Inheritance{
	
	public static void main(String[] args) {
		Derived d=new Derived();
		d.getInfo1("HR",20000);
		d.putInfo1();
	}

	}
