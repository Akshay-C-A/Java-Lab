package lab1;
import java.util.*;

public class ExceptionProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char choice;
		int num1,num2,result;
		do
		{
			System.out.println("Program to perform Division");
			System.out.print("Enter Number-1:");
			num1=sc.nextInt();
			System.out.print("Enter Number-2:");
			num2=sc.nextInt();
			try {
				result=num1/num2;
				System.out.println("Result="+result);
				System.out.println("End of try block");
			}
			catch(ArithmeticException e) {
				System.out.println(e);
			}
			finally {
				System.out.println("finally block content");
				System.out.println("Mycode is safe from exception");
			}
				
			
			System.out.println("Do you want to continue? y or n");
			choice=sc.next().charAt(0);
		}while(choice=='y');
		sc.close();
	}
	
}
