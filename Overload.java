package tapa;

public class Overload {
	
	
	public static void box (int a, int b) {
		System.out.println("the sum of int a , int b ");
		System.out.println("box sum"+" :"+(a+b));
		
	}
	public static void box(String a, int b) {
		System.out.println("string and interger");
		System.out.println("box with string"+ "  :" +(a+" "+b));
		
	}
	
	public static int table(int a, int b) {
		return a+b;
		
	}
	
	public static void main (String [] args) {
		int a =100 ;
		int b= 200;
		
		System.out.println("all new");
	System.out.println ("all new adds" +(a+b));
	box(50,80);
	box("overload",150);
	Overload obj= new Overload();
	
	System.out.println( "make new object access"  +obj.table(200,201));
	
	System.out.println( "make new object access " +obj.table(5,55));
	}

}
