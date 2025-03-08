package javalab;
import java.util.*;

class Account{
	int accNo;
	String name;
	String accType;
	double balance;
	Scanner sc = new Scanner(System.in);
	void openAccount() {
		System.out.print("Enter Account No: ");  
        accNo = sc.nextInt();  
        System.out.print("Enter Account type: ");  
        accType = sc.next();  
        System.out.print("Enter Name: ");  
        name = sc.next();  
        System.out.print("Enter Balance: ");  
        balance = sc.nextDouble();  
	}
	void showAccount() {
		System.out.println("Name of account holder: " + name);  
		System.out.println("Account no.: " + accNo);  
		System.out.println("Account type: " + accType);  
		System.out.println("Balance: " + balance);  
	}
	void deposit() {
		try {
		double amount;  
		System.out.println("Enter the amount you want to deposit: ");  
		amount = sc.nextDouble();
		if(amount<=0)
		{
			throw new InvalidAmountException("Amount should be greater than zero!!!");
		}
		balance = balance + amount;  
		System.out.println("****Balance Updated****");
		System.out.println("New Balance :  "+balance);
		}catch(InvalidAmountException e)
		{
			System.out.println("InvalidAmountException: "+e.getmessage());
		}

	}
	void withdrawal() {
		try {
		double amount;  
        System.out.println("Enter the amount you want to withdraw: ");  
        amount = sc.nextDouble();
        if(amount>balance)
		{
        	throw new InsufficientFundsException("Entered Amount greater than Balance!!!");
		}
		if(amount<=0)
		{
			throw new InvalidAmountException("Amount should be greater than zero!!!");
		}
        if(balance>amount) {
            balance = balance-amount;  
            System.out.println("Balance after withdrawal: " + balance);  }
	}catch(InvalidAmountException e)
		{
		System.out.println("InvalidAmountException : "+e.getmessage());
		
	}catch(InsufficientFundsException e)
		{
		System.out.println("InsufficientFundsException : "+e.getmessage());
		}

	}
	
	boolean searchAccount(int accno) {
		if(accNo==accno) {
			return(true);
		}
		else
			return(false);
	}

}

public class CustomException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch;
		char choice;
		System.out.print("How many number of customers do you want to input? :   ");  
	    int n = sc.nextInt();  
	    Account a[] = new Account[n]; 
	    int i=0,j=0,acno;
	    boolean found=false;
		System.out.println("..................BANKING SYSTEM....................");  		
		do {
		System.out.println("\nSelect choice  : ");
		System.out.println("1. Open Account\n2. Show all Account\n3. Deposit the amount\n4. Withdraw the amount\n5. Search Account\n6. Exit ");
		System.out.print("\nEnter your choice: ");
		ch = sc.nextInt();
		
		switch (ch) {  
			case 1:
				if(i<n) {
				a[i]=new Account();
				a[i].openAccount();
				j++;
				i++;}
				break;  
			case 2:
				for(i=0;i<j;i++) {
					a[i].showAccount();
					System.out.println("");}
				break;  
			case 3:  
				 System.out.print("Enter Account no. : ");  
                 acno = sc.nextInt();  
                 found = false;  
                 for (i = 0; i < j ; i++) {  
                     found = a[i].searchAccount(acno);  
                     if (found) {
                    	 a[i].showAccount();
                         a[i].deposit();  
                         break;  
                     }  
                 }
                 if (!found) {  
                     System.out.println("Search failed! Account doesn't exist..!!");  
                 }  
				break;  
			case 4:
				System.out.print("Enter Account No : ");  
                acno = sc.nextInt();  
                found = false;  
                for (i = 0; i < j; i++) {  
                    found = a[i].searchAccount(acno);  
                    if (found) { 
                    	a[i].showAccount();
                        a[i].withdrawal();
                    	break;
                    }
                }
                if (!found) {  
                    System.out.println("Search failed! Account doesn't exist..!!");  
                }  
				break;  
			case 5:
				  System.out.print("Enter account no. you want to search: ");  
                  acno = sc.nextInt();  
                  found = false;  
                  for (i = 0; i < j; i++) {  
                      found = a[i].searchAccount(acno);
                      if (found) {  
                    	  System.out.println("ACCOUNT FOUND ");
                    	  a[i].showAccount();
                    	  break;
                      } } 
                      if(!found){  
                    	  System.out.println("Search failed! Account doesn't exist..!!");  
                      }  
                      break;
			case 6:
				System.out.println("ThankYou!!");
				System.exit(0);
				break;
			default :
				System.out.println("Invalid input!!");
				break;
			
			}
			System.out.println("\nDo you want to continue ? ? Yes = y , No = n");
			System.out.print("Enter your choice : ");
			choice=sc.next().charAt(0);
        
		}while(choice=='y'||choice=='Y');
		
		sc.close();
	}
	
	}



