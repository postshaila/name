package tim;

public class Boys {

	int a;
	String  b;
	
	int c;
	double d;

public  void ram() {   // non static  --- need to create a object
	
	System.out.println("i am non static");
}

public static void kim() {
	System.out.println("i am static");
}

void suresh () {
	
System.out.println("just void");	
}

public  int cal( int a, int b) {
	int cal = a+b;
	return cal;
	
}
public static void runn(int s, String t) {
System.out.println((s+t));	
}

public static void main (String [] args) {
	
System.out.println("ok");	
	Boys bb = new Boys();  /// object created
	bb.ram();  /// non static object called  
	kim(); /// static directly called
	bb.suresh();
	System.out.println(bb.cal(100,500));
	int resultbb= bb.cal(45,5);
	System.out.println(resultbb);
	System.out.println(bb.cal(50,70));
	runn(30,"i am new");
	
}}
