package tapa;
import java.util.*;
public class Tax {
	public void raj() {
		
		System.out.println("all is well");
	}
	
	public static int raj(int a) {
	System.out.println("a new number");	
	return +a;
	}

	
	public static void kum(int a) {
		
		if (a>10) {
		System.out.println(" a new number");
		
		}
		else {
		System.out.println("no number");
		}
		
		}
	
	public static void sham(String book) {
		Scanner obj = new Scanner(System.in);
		String name = obj.nextLine();
		System.out.println("i am new number"+name);
		
	}
	
public static void main(String [] args) {
	Tax obj = new Tax();
	obj.raj();
	
	System.out.println(raj(88));;
	kum(1);
 
	sham("all is 99999");
}
}
