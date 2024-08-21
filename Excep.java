package aug174;

public class Excep {
	
	public static void main (String [] args) {
		
		try {
		int c ,a=10,b=0;
		c=a/b;
		System.out.println(c);
		}
		catch (Exception e) {
			System.out.println("a big error of divition"    +e);
		}
	}

}
