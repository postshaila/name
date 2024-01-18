package tapa;

public class Enc {
private	String name ;  // private
	
	public String getname() { // getname phrase
		
		return name;    
	}

	public void setname(String kk)  {  // set name
		 this.name = kk;
		 
	}


public static void main (String [] args) {
	
	Enc obj = new Enc();  // create obj
	obj.name="sai";    // set name
	System.out.println(	obj.getname());
	obj.setname("rajaaa");  // change name
	System.out.println(obj.getname()); // after changes get name
}}