package aug174;

abstract class Abst {
	 abstract void man();
}
 class team extends Abst{
	public void man() {
		System.out.println("team");
}

	public static void ball() {
		System.out.println("ok");
	}
	public static void main (String [] args) {
		team obj = new team();
	obj.man();	
		//obj.ball();
	}
}
