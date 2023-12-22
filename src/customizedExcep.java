class PassException extends RuntimeException
{
	PassException(String a)
	{
		super (a);
	}
}
class FailException extends RuntimeException
{
	FailException(String a)
	{
		super (a);
	}
}
public class customizedExcep {
public static void main(String [] args) {
	
	int mark = 35;

if(mark>=35)
{
	throw new PassException("Person is Pass");
}
else
{
	throw new FailException("Person is Fail");
}


}

	
	
}
