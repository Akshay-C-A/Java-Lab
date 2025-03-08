package javalab;
import java.util.*;

class Employee {
	String name=new String();
	int age;
	Long phonenumber;
	String address=new String();
	float salary;

	Employee(String name1,int age1,Long phonenumber1,String address1,float salary1) {
			name=name1;
			age=age1;
			phonenumber=phonenumber1;
			address=address1;
			salary=salary1;
}

	void print_Employee() {
		System.out.println("NAME : "+name);
		System.out.println("AGE : "+age);
		System.out.println("PHoneNo :"+phonenumber);
		System.out.println("Address :"+address);
		System.out.println("Salary :"+salary);
}
}

class Officer extends Employee {
	String specialization=new String();
	Officer(String name1,int age1,Long phonenumber1,String address1,float salary1,String specialization1) {
		super(name1,age1,phonenumber1,address1,salary1);
		specialization=specialization1;
	}
	void print_Specialization() {
		System.out.println("Specialization :"+specialization);
	}
}

class Manager extends Employee {
	String department=new String();
	Manager(String name1,int age1,Long phonenumber1,String address1,float salary1,String department1) {
		super(name1,age1,phonenumber1,address1,salary1);
		department=department1;

	}
	void print_Department() {
		System.out.println("Department :"+department);
	}
}

public class Inheritance {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int age;
		String name=new String();
		float salary;
		Long phonenumber;
		String address=new String();
		String specialization=new String();
		String department=new String();
		
		System.out.println("Enter the details of the Officer :");
		System.out.print("Enter the Name :");
		name=sc.next();
		System.out.print("Enter the Age :");
		age=sc.nextInt();
		System.out.print("Enter the Phone number :");
		phonenumber=sc.nextLong();
		System.out.print("Enter the Address :");
		address=sc.next();
		System.out.print("Enter the Salary :");
		salary=sc.nextFloat();
		System.out.print("Enter the Specialization :");
		specialization=sc.next();
		Officer o=new Officer(name,age,phonenumber,address,salary,specialization);
		
		System.out.println("\n");
		
		System.out.println("Enter the details of the Manager :");
		System.out.print("Enter the Name :");
		name=sc.next();
		System.out.print("Enter the Age :");
		age=sc.nextInt();
		System.out.print("Enter the Phone number :");
		phonenumber=sc.nextLong();
		System.out.print("Enter the Address :");
		address=sc.next();
		System.out.print("Enter the Salary :");
		salary=sc.nextFloat();
		System.out.print("Enter the department :");
		department=sc.next();
		Manager m=new Manager(name,age,phonenumber,address,salary,department);
		
		System.out.println("\n");
		System.out.println("The details of Officer are :");
		o.print_Employee();
		o.print_Specialization();
		System.out.println("\n");
		System.out.println("The details of Manager are :");
		m.print_Employee();
		m.print_Department();
		
		sc.close();


	}

}


