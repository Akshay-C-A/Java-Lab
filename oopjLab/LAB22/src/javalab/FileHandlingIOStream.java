package javalab;
import java.util.Scanner;
import java.io.*;

public class FileHandlingIOStream {
	public static void main(String[] args)throws IOException {
		Scanner sc=new Scanner(System.in);
		int n,i,a;
		try
		{
			File fn=new File("number.txt");
			if(fn.exists())
			{
				System.out.println(fn.getName()+" exists");
			}
			else
			{
				System.out.println("Created new File : "+fn.getName());
			}
			System.out.println("Enter the number of inputs : ");
			n=sc.nextInt();
			FileOutputStream fn1=new FileOutputStream("number.txt");
			System.out.println("Enter the "+n+" numbers : ");
			for(i=0;i<n;i++)
			{
				a=sc.nextInt();
				fn1.write(a);
			}

			File fo=new File("odd.txt");
			File fe=new File("even.txt");
			if(fo.exists())
			{
				System.out.println(fo.getName()+" exists");
			}
			else
			{
				fo.createNewFile();
				System.out.println("Created new File : "+fo.getName());
			}
			if(fe.exists())
			{
				System.out.println(fe.getName()+" exists");
			}
			else
			{
				fe.createNewFile();
				System.out.println("Created new File : "+fe.getName());
			}
			FileInputStream fn2=new FileInputStream("number.txt");
			FileOutputStream fo1=new FileOutputStream("odd.txt");
			FileOutputStream fe1=new FileOutputStream("even.txt");

			int c;
			System.out.println("\nNumbers in "+fn.getName()+" : ");
			while((c=fn2.read())!=-1)
			{
				System.out.println(c);
				if(c%2==0)
					fe1.write(c);
				else
					fo1.write(c);
			}
			FileInputStream fo2=new FileInputStream("odd.txt");
			FileInputStream fe2=new FileInputStream("even.txt");
			System.out.println("\nNumbers in "+fo.getName()+" : ");
			while((c=fo2.read())!=-1)
			{
				System.out.println(c);
			}
			System.out.println("\nNumbers in "+fe.getName()+" : ");

			while((c=fe2.read())!=-1)
			{
				System.out.println(c);
			}

		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found");
		}
		catch(Exception e1)
		{
			System.out.println(e1.getMessage());
		}
	}
}
