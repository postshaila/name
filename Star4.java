package books;

public class Star4 {
	int a=88;
	public void man(int a) {
		this.a =a;
		//System.out.println("all"+a);
		if (a>10) {
			System.out.println(this.a);}
			else {
				System.out.println(a);
			}
		}
	
public static void main (String [] args) {
	Star4 obj= new Star4();
	
	obj.man(100);
}
}
