package oops;
class Person1{
	String Name;
	int age;
	void getperInfo(String str,int ag) {
		Name=str;
		age=ag;
	}
	void putPerInfo(){
		System.out.println("Name:"+Name);
		System.out.println("Age:"+age);
	}
}
class student1 extends Person1{
	int total;
	char grade;
	void getStudInfo(String n,int ag,int tot,char gr) {
		getperInfo(n,ag);
		total=tot;
		grade=gr;
	}
	void putStudInfo() {
		putPerInfo();
		System.out.println("Total:"+total);
		System.out.println("Grade:"+grade);	
	}
}
class single_inheritance{
	public static void main(String[] args) {
		student1 s=new student1();
		s.getStudInfo("Honey",22,98,'a');
		s.putStudInfo();
	}
}
