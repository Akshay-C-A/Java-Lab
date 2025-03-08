package javalab;
import java.util.*;

public class SumTokenizer
{
	public static void main(String args[]){
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integers with one space gap:");
		String s = sc.nextLine();
		StringTokenizer st = new StringTokenizer(s, " ");

		while (st.hasMoreTokens())
		{
			int integer=Integer.parseInt(st.nextToken());
			System.out.println(integer);
			sum=sum+integer;
		}
		System.out.println("sum of the integers is: " + sum);
		sc.close();
	}
}
