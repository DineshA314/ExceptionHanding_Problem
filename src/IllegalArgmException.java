
public class IllegalArgmException {
public static void main(String [] args) {
	
	Thread t = new Thread();
	t.setPriority(2);
	t.setPriority(112);
}
}
