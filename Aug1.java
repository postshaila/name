package aug174;



interface joy {
	void names();
	
class boys implements joy{
	public void names() {
		System.out.println(" i am interface with implement"	);}
}

	public static void main (String [] args) {
		boys obj = new boys();
		obj.names();
		
	}}
