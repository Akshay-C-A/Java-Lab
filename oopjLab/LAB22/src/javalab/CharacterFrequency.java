package javalab;
import  java.util.*;

public class CharacterFrequency {
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter String\n");
			String str = new String();
			str=sc.nextLine().toLowerCase();
			int NumCount = 0;
			char[] charArr = str.toCharArray();
			System.out.println("Enter the character to count\n");
			char ele = sc.next().toLowerCase().charAt(0);
			for(char ch: charArr)
			{
				if(ch==ele)
					NumCount++;
			}
			System.out.println("The number of times "+ele+" occured is "+NumCount);
			sc.close();
		}
}
