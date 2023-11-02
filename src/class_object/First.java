package class_object;

public class First {
int num1,num2,result;
void add() {
	num1=10;
	num2=20;
	result=num1+num2;
	System.out.println("addition answer:"+result);
}
void sub() {
	result=num1-num2;
	System.out.println("subtraction answer:"+result);
}
void mul() {
	result=num1*num2;
	System.out.println("Multiplication answer:"+result);
}
void div() {
	result=num1/num2;
	System.out.println("Division answer:"+result);
}

	public static void main(String[] args) {
		Data d1=new Data();
		d1.display();
		First f=new First();
		f.add();
		f.sub();
		f.mul();
		f.div();
	}

}
