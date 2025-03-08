package javalab;
import java.util.Scanner;

class Table {
	void printTable(int n)
	{
		synchronized(this) {
			for(int i=1;i<=10;i++)
			{
				System.out.println(n+"+"+i+"="+(n+i));
				try
				{
					Thread.sleep(400);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
		}
	}
}

class Thread1 extends Thread {
	Table t;
	int n;
	Thread1(Table t) {
		this.t=t;
	}
	public void run()
	{
		t.printTable(n);
	}
}

class Thread2 extends Thread {
	Table t;
	int n;
	Thread2(Table t) {
		this.t=t;
	}
	public void run()
	{
		t.printTable(n);
	}
}

class Thread3 extends Thread {
	Table t;
	int n;
	Thread3(Table t) {
		this.t=t;
	}
	public void run()
	{
		t.printTable(n);
	}
}

public class ThreadSynchronization{
	public static void main(String args[]) {
		try {
			Scanner sc=new Scanner(System.in);
			Table t=new Table();
			Thread1 t1=new Thread1(t);
			Thread2 t2=new Thread2(t);
			Thread3 t3=new Thread3(t);
			System.out.print("Enter the First Number :");
			t1.n=sc.nextInt();
			System.out.print("Enter the Second Number :");
			t2.n=sc.nextInt();
			System.out.print("Enter the Third Number :");
			t3.n=sc.nextInt();
			t1.start();
			t1.join();
			System.out.println("");
			t2.start();
			t2.join();
			System.out.println("");
			t3.start();
		}	
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
