package javalab;
import java.util.*;

public class StringPalindrome {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int Yes;
		
		do
		{
		System.out.println("Enter the String  :\n");
		String OrgStr= s.next().toLowerCase();
		String Reverse="";
		int StrLen= OrgStr.length();
		for(int i =(StrLen-1);i>=0;i--)
		{
			Reverse= Reverse + OrgStr.charAt(i);
			
		}
		
		if(OrgStr.equals(Reverse))
			System.out.println("The string is Palindrome\n");
		else
			System.out.println("The string is not Palindrome\n");
		System.out.println("Do You Want to Continue?\nYES-1\nNO-0\n");
	    Yes = s.nextInt();
		}while(Yes==1);
		
		s.close();	
         
	}

}



