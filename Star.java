package books;

public class Star {

	int a;
	int b;
public void man (int a, int b) {   // to use this don't use ----static---
	this.a=a;// this represents current object
	this.b=b;
	System.out.println(+a+b);
	System.out.println(this.a+this.b);
}

public void van (int a, int b) {
System.out.println(+a+b);
}
	public static void main (String [] args) {
	
	
	Star obj = new Star();
	obj.man(45,55);
	obj.van(1,2);
	//System.out.println( obj.man(10,20));
	//obj.van(500,200);
}}