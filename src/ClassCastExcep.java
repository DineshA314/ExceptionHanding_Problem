
public class ClassCastExcep {
public static void main(String [] args) {
/*	String  s = new String("dinesh");
	System.out.println (s);
	Object o =(Object)s;
	System.out.println (o);
*/
	Object o =new Object();
	String s = (String)o;   //these is a type cast
	
	Object o1 =new String();
	String s1 = (String)o1;
	
}
}
