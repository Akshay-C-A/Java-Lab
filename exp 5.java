package lab1;

class Employee{
	String name= new String();
	int age;
	long phoneNo;
	String address = new String();
	float salary;
	void printSalary() {
		System.out.println("Salary : "+salary);
	}
	void print_Employee() {
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("PhoneNo : "+phoneNo);
		System.out.println("Address : "+address);
	}
	}

class Officer extends Employee{
	String specialisation = new String();
	void print_Specialisation() {
		System.out.println("Specialization : "+specialisation);
}
}

class Manager extends Employee{
	String department = new String();
	void print_Department() {
		System.out.println("Department : "+department);
	}
}

public class EmpDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Officer o = new Officer();
		Manager m = new Manager();
		o.name="Akshay C.A";
		o.age=18;
		o.phoneNo= 885544455;
		o.salary=5000000;
		o.address="pala,Kottayam";
		o.specialisation="Executive";
		
		m.name="Rohan Joshy";
		m.age=32;
		m.phoneNo= 885485788;
		m.salary=8000000;
		m.address="paika,Kottayam";
		m.department="Systems Management";
		
		o.print_Employee();
		o.printSalary();
		o.print_Specialisation();
		System.out.println("\n");
		m.print_Employee();
		m.printSalary();
		m.print_Department();
	}

}
