package javalab;

public class InsufficientFundsException extends Exception {
	private String message;
	public InsufficientFundsException(String msg)
	{
		message=msg;
	}
	public String getmessage()
	{
		return message;
	}
}
