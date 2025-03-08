package lab1;
import java.util.*;
import java.io.*;

public class FileHandlingReader {
	public static void main(String[] args) throws IOException {
		try {
			Scanner sc= new Scanner(System.in);
			
			//sample.txt creation 
			File obj = new File("sample.txt");
			if(obj.exists()) {
				System.out.println("sample.txt exists\n");
			}
			else {
				obj.createNewFile();
				System.out.println("sample.txt created\n");
			
			//input string to sample.txt
			String str;
			System.out.println("Enter the String : ");
			str=sc.nextLine();
			FileWriter f=new FileWriter("sample.txt");
			f.write(str);
			f.close();
			System.out.println("content written to sample.txt\n");
			}
			//new-sample.txt creation
			File obj2 = new File("new-sample.txt");
			if(obj2.exists()) {
				System.out.println("new-sample.txt exists\n");
			}
			else {
				obj2.createNewFile();
				System.out.println("new-sample.txt created\n");
			}
			
			//copying contents
			FileReader obj1=new FileReader("sample.txt");
			char[] content=new char[100];
			obj1.read(content);
			obj1.close();
			   
			 FileWriter obj3=new FileWriter("new-sample.txt");
			 obj3.write(content);
			 obj3.close();
			 System.out.println("contents copied from sample.txt to new-sample.txt\n");
			  
			   //prints the new-sample.txt contents
			 System.out.println("Contents of new-file.txt :\n");
			 FileReader obj4=new FileReader("new-sample.txt");
			 BufferedReader br=new BufferedReader(obj4);
			 String str2;
			 while((str2=br.readLine())!=null){
				   System.out.println(str2);}
			
		}catch(IOException e) {
				System.out.println("Exception occurs");
			}
	}

}
