package lab1;
import java.util.*;

class Employee3{
	double BSalary,DA,HRA,GSalary;
	void display() {
		System.out.println(".....EMPLOYEE.....");
	}
	void calcSalary(){
		GSalary=BSalary+((BSalary*DA)/100)+((BSalary*HRA)/100);
		System.out.println("The Gross Salary of employee is "+GSalary);
	}
}

class Engineer extends Employee3{
	void display() {
		super.display();
		super.calcSalary();
		System.out.println(".....ENGINEER.....");
	}

	void calcSalary() {
		System.out.println("The Gross Salary of engineer is "+GSalary*2);
	}
}

public class EmpSalary {
	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		Engineer e=new Engineer();
		
		System.out.println("Enter the basic salary:");
		e.BSalary=s.nextDouble();
		
		System.out.println("Enter the DA % of the employee:");
		e.DA=s.nextDouble();
		
		System.out.println("Enter the HRA % of the employee:");
		e.HRA=s.nextDouble();
		e.display();
		e.calcSalary();
		s.close();
	}

}