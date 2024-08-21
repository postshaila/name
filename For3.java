package aug174;

public class For3 {

	private int age;
	private String name;
	private int room; 
	For3(int s, String t,int r){
		this.age=s;
		this.name=t;	
		this.room=r;
	}
	
	public void stinfo(int a, String b) {
		this.age=a;
		this.name= b;
	System .out.println(a +"\t"+b);
	}
	
	public  void boyinfo(int a, String b,int r) {
			System .out.println(a );
	}
	
	
	public static void main (String [] args) {
		For3 obj = new For3(10,"pl",8);
		obj.stinfo(44,"ok");
		obj.boyinfo(5,"45",585);
		
		}
	
}
