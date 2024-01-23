package tapa;
import java.util.*;
public class Scann {

	public static void raj() {
		System.out.println("enter a string");
	Scanner obj = new Scanner(System.in); // taking input 
	String man = obj.nextLine();
	System.out.println("my name on list is as"+":"+man);
	obj.close();
	}
	
	public static void tip() {
		System.out.println("enter a number");
		Scanner boys = new Scanner (System.in);
		int allboys=boys.nextInt();
		System.out.println(+allboys);
		System.out.println(" my new contact numer"+":"+allboys);
		boys.close();
	}
	
	public static void main (String [] args) {
		Scann.tip();
		raj();
		//System.out.println(raj("jump"));
		//System.out.println(Scann.tip());
	}
	
}
