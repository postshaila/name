package tapa;

public class Basic {
	
		
	public static void book(int a, int b) {
		System.out.println(a+b);}
	public static void book(int a, int b,int c) {
	 System.out.println(a+b);	
			}
	public static void book(int a,String c) {
		 System.out.println(a+" "+c);	
				}
	
	
public static void main (String []args) {
	book(50,60);
	book(50,60,70);
	book(50,"all");
	
}
}