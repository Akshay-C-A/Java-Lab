package javalab;
public class InvalidAmountException extends Exception {
	private String message;
	public InvalidAmountException(String msg)
	{
		message=msg;
	}
	public String getmessage()
	{
		return message;
	}
}