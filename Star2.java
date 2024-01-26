
package books;

public class Star2 {

	 private int a;  
	public  void st(int a) { // to use this  * dont use static
		this.a=a;   // this is used  to use 500 i.e to change from 8
		System.out.println(+a);
		System.out.println("nnnn"+this.a);
		
	}
	
	public static void man(int a) {
		System.out.println(a);    // is assigned with a = 100
	}
	public static void main(String [] args) {
		
			Star2 obj = new Star2();
		obj.st(500);
		man(100);
		
	}
}
