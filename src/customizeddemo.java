class ownException extends RuntimeException
{
	ownException(String s)
	{
		super(s);
	}
}
public class customizeddemo {
public static void main(String [] args)
{
	try
	{
	int a = 10/0;
	}
	catch (ArithmeticException e)
	
	{
		throw new ownException("These is our ownException");
	}
	
}
}
