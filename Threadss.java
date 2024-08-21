package aug174;

public class Threadss extends Thread{
public    void run() {
		for (int i = 0;i<20;i++)
					System.out.println(i);	}
public static void main (String []args) {
	Threadss obj = new Threadss();
	obj.start();
// obj.start();
}
}
