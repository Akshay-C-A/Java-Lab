package javalab;
import java.util.Scanner;
public class ExceptionHandling {
	public static void main(String[] args) {
		char choice='a';
		Scanner sc=new Scanner(System.in);
		int ch;
		do {
		System.out.println("Select One:\n1.Arithmeticexception\n2.Arrayindexoutofboundsexception") ;
		ch=sc.nextInt() ;
		switch(ch)
		{
			case 1:
				try {
					int num1,num2,div;
					System.out.print("Enter First Number:");
					num1=sc.nextInt();
					System.out.print("Enter Second Number:");
					num2=sc.nextInt();
					div=num1/num2;
					System.out.println("Result="+div);
					System.out.println("End of try block");
					}
				catch(ArithmeticException e) {
					System.out.println("java.lang.ArithmeticException: / by zero");
				}
				finally {
					System.out.println("finally block content");
					System.out.println("My code is safe from exception");
				}
				System.out.println("\n");
				break;

			case 2 : try {
				int n;
				System.out.println("Enter the number of elements of array : ");
				n=sc.nextInt();
				int[] a=new int[n];
				System.out.println("Enter the elements of the array : ");
				for(int i=0;i<n;i++)
				{
					a[i]=sc.nextInt();
				}
				System.out.println("Legth of Array : "+n);
				System.out.println("Array elements : ");
				for(int i=0;i<n;i++)
				{
					System.out.print(" "+a[i]);
				}
 
				System.out.println("\nEnter the position to access : ");
				int pos=sc.nextInt();
				System.out.println("Element in "+pos+" position is "+a[pos-1]);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Array Index is out of bounds");
			}
			break;
		}
		System.out.println("Do you want to continue ? Yes=y No=n");
		choice=sc.next().charAt(0);
	}while(choice=='y');
		sc.close();
	}
}