package aug174;

public class Threadrun implements Runnable{
	public void run() {
		System.out.println("i am runnable thread");
	}
	
public static void main (String [] args) {
	Threadrun obj = new Threadrun();
	Thread king = new Thread(obj);
	king.start();
}
}
