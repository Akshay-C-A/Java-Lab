package javalab;
import java.util.Random;
import java.util.Scanner;

class Rand extends Thread {
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the limit  : ");
		int cout = sc.nextInt();
		for(int i=0;i<cout;i++) {
			Random r=new Random();
			int n=0;
			n=r.nextInt(100);
			System.out.println("Random Number : "+n);
			try {
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			if(n%2==0) {
				SquareThread t2=new SquareThread(n);
				t2.start();
			}
			else {
				CubeThread t3=new CubeThread(n);
				t3.start();
			}
			try {
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
class SquareThread extends Thread {
	int n;
	SquareThread(int n) {
		this.n=n;
	}
	public void run() {
		System.out.println("Square of "+n+" : "+n*n);
	}
}
class CubeThread extends Thread {
	int n;
	CubeThread(int n) {
		this.n=n;
	}
	public void run() {
		System.out.println("Cube of "+n+" : "+n*n*n);
	}
}

public class MultiThreadProg {
	public static void main(String[] args) {
		Rand t1=new Rand();
		t1.start();
	}
}

