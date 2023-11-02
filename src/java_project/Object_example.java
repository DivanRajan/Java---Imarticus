package java_project;
class Object_example {
	int id;
	String name;
	//constructor to initialize integer and string
	Object_example(int i,String n){
		id=i;
		name=n;
	}
	//constructor to initialize another object
	Object_example(Object_example s){
		id=s.id;
		name =s.name;
	}
	void display() {System.out.println(id+" "+name);}
	public static void main(String[] args) {
		Object_example s1=new Object_example(111,"karan");
		Object_example s2=new Object_example(s1);
		s1.display();
		s2.display();
	}

}
