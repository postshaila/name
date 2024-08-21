package aug174;

public class Fors {
	public void man(int a) {
		for (int i =0; i <25;i++) {
		
		if (i  ==10) 
		break;
			
		System.out.println(i);}
		
	}
public static void main (String [] args) {
	Fors obj = new Fors();
	try {
	obj.man(55);
	} catch (Exception e) {
		System.out.println("big error " +e);
	}
	System.out.println("done");
}
}