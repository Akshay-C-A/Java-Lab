package lab1;
import java.util.*;
import java.io.*;

public class EXP12FileInputAndOutputStream {
	public static void main(String[] args) {
		try {
			Scanner sc= new Scanner(System.in);
			
			//numbers.txt creation 
			File obj1 = new File("number.txt");
			obj1.createNewFile();
			System.out.println("number.txt created\n");
			
			File obj2 = new File("odd.txt");
			obj2.createNewFile();
			System.out.println("even.txt created\n");
			
			File obj3 = new File("number.txt");
			obj3.createNewFile();
			System.out.println("even.txt created\n");
			
			//reading the elements
			
		}catch(IOException e) {
				System.out.println("Exception occurs");
			}
	}

}
