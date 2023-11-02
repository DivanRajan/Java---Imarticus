package oops;
class bankaccount{
	int acc_id;
	String acc_name;
	float amount;
	void insert(int id,String name,float amt) {
		acc_id=id;
		acc_name=name;
		amount=amt;
	}
	void display() {
		System.out.println(acc_id+" "+acc_name+" "+amount);
		//System.out.print(acc_name);
		//System.out.println(amount);
	}void deposit(float m){
		amount=amount+m;
		System.out.println(m+" deposited");
		
	}void withdraw(float n){
		amount=amount-n;
		System.out.println(n+" withdraw");
	}void balance(){
		System.out.println("Balance is:"+amount);
	}
	
}
public class Bank_details {

	public static void main(String[] args) {
		bankaccount s=new bankaccount();
		s.insert(20,"divan",1000);
		s.display();
		s.balance();
		s.deposit(40000);
		s.balance();
		s.withdraw(15000);
		s.balance();

	}

}
