package oops;
class Constructor_Overloading{
	int id;
	String name;
	int age;
	//creating two arg constructors
	Constructor_Overloading(int i,String n){
		id =i;
		name=n;
	}
	//creating three arg constructor
	Constructor_Overloading(int i,String n,int a){
		id =i;
		name =n;
		age=a;
		
	}
	void display() {System.out.println(id+" "+name+" "+age);}
	
	public static void main(String[] args) {
		Constructor_Overloading s1=new Constructor_Overloading(111,"karan");
		Constructor_Overloading s2=new Constructor_Overloading(111,"karan",25);
		s1.display();
		s2.display();
		

	}

}