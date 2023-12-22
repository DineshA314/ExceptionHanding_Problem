class a
{
	//static int x = 10/0;
	static 
	{
		String x = null;
		System.out.println(x.length());
	}
}

public class ExceptionInInitializertionError {
public static void main(String [] args)
{
	//static int x = 10/0;
	a a1  = new a();
}
}
