package oops;

import java.util.Scanner;

class employee1 {
	int empid;
	String empname;
	int salary;
	int bonus;
	int netsal;
	void insert(int e_id,int sal,int bon,String name) {
		empid=e_id;
		salary=sal;
		bonus=bon;
		empname=name;
		}
	void calculate2 (){
		netsal=salary+bonus;
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(netsal);
	
	}
}
class Employee{
	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		System.out.print("Enter the number of employee:");
		int n=s.nextInt();
		int id[]=new int [n];
		String name[]=new String[n];
		int sal[]=new sal[n];
		int bonus[]=new int [n];
		for(int i=o;i<n;i++) {
			System.out.println("Enter the employee id:");
			id[i]=s.nextInt[];
			
			
			
			
		}
	employee1 a1= new employee1();
	a1.insert(2000,3000,1000,"divan");
	a1.calculate2();
	
		

	}
}
