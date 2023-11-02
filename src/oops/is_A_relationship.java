package oops;

class  Employee2{
	float salary=40000;
}
class is_A_relationship extends Employee2{
	int bonus=10000;
	public static void main(String[] args) {
		is_A_relationship p=new is_A_relationship();
		System.out.println("Programmer salary is:"+p.salary);
		System.out.println("bonus of Programmer is:"+p.bonus);
		
	}

}
